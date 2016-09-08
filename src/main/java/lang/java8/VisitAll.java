package lang.java8;

import java.util.HashMap;
import java.util.HashSet;

import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.QualifiedNameExpr;
import com.github.javaparser.ast.visitor.TreeVisitor;

import scan.TechProfile;


class VisitAll extends TreeVisitor {

    private TechProfile _profile;

    public HashSet<Node> nodes = new HashSet<>();

    //
    // Map NamedExpr names to Fully Qualified Names
    // Example: 
    // {
    //      "String":       "java.lang.String",
    //      "TypeToken":    "com.google.gson.reflect.TypeToken"
    // }
    //
    public HashMap<String, String> namedExprToFQN = new HashMap<>();

    public VisitAll(TechProfile profile) {
        _profile = profile;
    }

    private String Add(String full, String name) {
        if (full.isEmpty()) {
            return name;
        } else {
            return name+"."+full;
        }
    }

    private String fullyQualifiedName(NameExpr name) {
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
            _profile.incrementGrammar(node.getClass().getSimpleName());
            nodes.add(node);
            if (node instanceof ImportDeclaration) {
                ImportDeclaration imp = (ImportDeclaration)node;
                NameExpr name = imp.getName();
                namedExprToFQN.put(name.getName(), fullyQualifiedName(name));
            } else if (node instanceof ImportDeclaration) {
            }
        }

}


