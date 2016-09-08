package lang.java8;

import java.util.function.Predicate;


final class NotFromJavaLang implements Predicate<Class<? extends Object>> {

    @Override
        public boolean test(Class<? extends Object> clazz) {
            String name = clazz.getName();
            if (name.startsWith("java.lang.")) {
                return name.substring(10).indexOf('.') != -1;
            }
            return true;
        }

}


