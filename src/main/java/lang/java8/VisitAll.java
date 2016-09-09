package lang.java8;

import static java.lang.System.out;
import java.util.HashMap;
import java.util.HashSet;

import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.QualifiedNameExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.visitor.TreeVisitor;

import scan.TechProfile;


class VisitAll extends TreeVisitor {
    /*
     * VisitAll will compile the list of call to libraries and the grammar usage.
     *
     * The grammar usage is easy, just pile up AST node references.
     *
     * The library usage is more difficult.
     *
     * Because we are dealing with a typed language, we have to do it in multiple stages:
     *
     * Stage 1: gather all references to types (pre-loaded, standard lib, third-party). (We ignore types declared as part of the project).
     * Stage 2: gather all bindings that reference any type in 1/ (fields, local vars, 'lvalue references', 'rvalue references', etc.)
     * Stage 3: scan the AST and count these binding references (NameExpr subtypes in the AST)
     * Stage 4: do 1-3 for 'before' and 'after', and take the absolute value of the diff of counts per library item
     * Stage 5: do it fast.
     */

    private TechProfile profile;

    public HashSet<Node> nodes = new HashSet<>();

    //
    // Map NamedExpr names to Fully Qualified Names
    // Example: 
    // {
    //      "String":       "java.lang.String",
    //      "TypeToken":    "com.google.gson.reflect.TypeToken"
    // }
    //
    public HashMap<String, String> typeNameExprToFQN = new HashMap<>(JavaLang.types);

    //
    // Map Variable Declarator Id  (a.k.a. bindings) to Type NamedExpr name.
    // Example:
    // "private Bar foo;" => { "foo": "Bar" }
    //
    public HashMap<String, String> bindings = new HashMap<>();

    public VisitAll(TechProfile profile) {
        this.profile = profile;
    }

    private static String Add(String full, String name) {
        if (full.isEmpty()) {
            return name;
        } else {
            return name+"."+full;
        }
    }

    private String fullyQualifiedName(NameExpr name) {
        //
        // This method should have been provided by the javaparser library.
        // TODO: write an issue on their Github project: https://github.com/javaparser/javaparser
        //
        String full = new String();
        NameExpr _name = name;
        do {
            full = Add(full, _name.getName());
            if (_name instanceof QualifiedNameExpr) {
                QualifiedNameExpr qualName = (QualifiedNameExpr)_name;
                _name = qualName.getQualifier();
            } else {
                break;
            }
        } while (true);
        return full;
    }

    @Override
        public void process(Node node) {
            profile.incrementGrammar(node.getClass().getSimpleName());
            nodes.add(node);
            if (node instanceof ImportDeclaration) {
                //
                // Stage 1: gather all references to types (pre-loaded, standard lib, third-party).
                //
                ImportDeclaration imp = (ImportDeclaration)node;
                NameExpr name = imp.getName();
                String fqn = fullyQualifiedName(name);
                typeNameExprToFQN.put(name.getName(), fqn);
                // we need to map the fqn:fqn because it is legal java to declare a var/field with an FQN
                // example: java.lang.String foo = "baba";
                typeNameExprToFQN.put(fqn, fqn);

            } else if (node instanceof FieldDeclaration) {
                FieldDeclaration field = (FieldDeclaration)node;
                String typeName = field.getType().toString();
                if (typeNameExprToFQN.containsKey(typeName)) {
                    String fqnType = typeNameExprToFQN.get(typeName);
                    field.getVariables().forEach( variable -> {
                        bindings.put(variable.getId().getName(), fqnType);
                        if (fqnType.startsWith("java")) {
                            this.profile.incrementSystem(fqnType);
                        } else {
                            this.profile.incrementThirdParty(fqnType);
                        }
                    });
                }

            } else if (node instanceof VariableDeclarationExpr) {
                VariableDeclarationExpr var = (VariableDeclarationExpr)node;
                String typeName = var.getType().toString();
                if (typeNameExprToFQN.containsKey(typeName)) {
                    String fqnType = typeNameExprToFQN.get(typeName);
                    var.getVars().forEach( variable -> {
                        bindings.put(variable.getId().getName(), fqnType);
                        if (fqnType.startsWith("java.")) {
                            this.profile.incrementSystem(fqnType);
                        } else {
                            this.profile.incrementThirdParty(fqnType);
                        }
                    });
                }
            }
        }

}


