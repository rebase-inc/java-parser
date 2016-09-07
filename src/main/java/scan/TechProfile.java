package scan;

import java.util.HashMap;
import java.util.function.BiFunction;

import lang.Language;


final class Increment implements BiFunction<Integer, Integer, Integer> {
    public Integer apply(Integer old, Integer new_) {
        return ++old;
    }
}


public final class TechProfile {

    public Language language;

    private Increment increment = new Increment();

    private HashMap<String, Integer> _data = new HashMap<>();

    public int[] data;

    public int nodes_visited = 0;

    public TechProfile(Language language) {
        this.language = language;
        data = new int[language.grammarRules().length];
    }

    public String[] getRuleNames() { return language.grammarRules(); }

    public void merge(TechProfile in) {
        int[] indata = in.data;
        for (int i=0; i < data.length; i++ ) {
            data[i] += indata[i];
        }
    }

    public void inc(String rule) {
        _data.merge(rule, 1, increment);
    }

    public HashMap<String, Integer> toMap() {
        if (_data.isEmpty()) {
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            String[] ruleNames = language.grammarRules();
            for (int i=0; i<data.length; i++) {
                map.put(ruleNames[i], data[i]);
            }
            return map;
        }
        return _data;
    }

}


