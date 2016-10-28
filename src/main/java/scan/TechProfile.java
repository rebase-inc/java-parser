package scan;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiFunction;

import lang.Language;


final class Increment implements BiFunction<Integer, Integer, Integer> {
    public Integer apply(Integer old, Integer new_) {
        return ++old;
    }
}


public final class TechProfile {

    public final Language language;

    private final Increment increment = new Increment();

    private final String grammarRulePrefix;

    private final String systemLibraryPrefix;

    private final String thirdPartyLibraryPrefix;

    private HashMap<String, Integer> _data = new HashMap<>();

    public int[] data;

    public int nodes_visited = 0;

    public TechProfile(Language language) {
        this.language = language;
        data = new int[language.grammarRules().length];
        grammarRulePrefix = "0.";
        systemLibraryPrefix = "1.";
        thirdPartyLibraryPrefix = "2.";
    }

    public String[] getRuleNames() { return language.grammarRules(); }

    public void merge(TechProfile in) {
        int[] indata = in.data;
        for (int i=0; i < data.length; i++ ) {
            data[i] += indata[i];
        }
    }

    public void put(String key, Integer count) {
        _data.put(key, count);
    }

    public void incrementGrammar(String rule) {
        _data.merge(grammarRulePrefix+rule, 1, increment);
    }

    public void incrementSystem(String tech) {
        _data.merge(systemLibraryPrefix+tech, 1, increment);
    }

    public void incrementThirdParty(String tech) {
        _data.merge(thirdPartyLibraryPrefix+tech, 1, increment);
    }

    public HashMap<String, Integer> toMap() {
        return _data;
    }

    public static TechProfile abs_diff(TechProfile a, TechProfile b) throws Exception {
        if (a.language != b.language) {
            throw new Exception("Cannot compare two different languages");
        }
        TechProfile delta = new TechProfile(a.language);
        HashMap<String, Integer> a_data = a.toMap();
        HashMap<String, Integer> b_data = b.toMap();
        Set<String> all_keys = new HashSet<String>(a_data.keySet());
        all_keys.addAll(b_data.keySet());
        all_keys.forEach( key -> {
            boolean in_a = a_data.containsKey(key), in_b = b_data.containsKey(key);
            if ( in_a && in_b ) {
                delta.put(key, Math.abs(a_data.get(key) - b_data.get(key)));
            } else if (in_a) {
                delta.put(key, a_data.get(key));
            } else if (in_b) {
                delta.put(key, b_data.get(key));
            }
        });
        return delta;
    }

}


