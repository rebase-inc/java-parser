package lang.java8;

import java.io.IOException;
import java.io.Reader;
import static java.lang.System.out;
import java.util.HashMap;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseException;
import com.github.javaparser.ast.CompilationUnit;

import lang.Language;
import scan.TechProfile;


public class Java8 implements Language {

    @Override
        public final String[] grammarRules() { return Grammar.rules; }

    @Override
        public final String name() { return "java8"; }

    @Override
        public TechProfile scan_contents(Reader code) throws IOException {
            TechProfile profile = new TechProfile(this);
            CompilationUnit cu;
            try {
                cu = JavaParser.parse(code);
                VisitAll visitor = new VisitAll(profile);
                visitor.visitDepthFirst(cu);
                //visitor.nodes.forEach((node)-> {
                    //out.println("++++++++++++++");
                    //out.println(node.getParentNode());
                    //out.println(node.getClass().getSimpleName());
                    //out.println(node);
                    //out.println("--------------");
                //});
                //visitor.typeNameExprToFQN.forEach((name, qual)-> out.printf("%s: %s\n", name, qual));

            } catch (ParseException e) {
                out.println("Cannot parse this code");
            } finally {
                try {
                    code.close();
                } catch (IOException e) {
                    out.println(e);
                }
            }
            return profile;
        }

}
