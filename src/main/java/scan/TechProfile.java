package scan;

import java.util.HashMap;
import java.util.function.BiFunction;


final class Increment implements BiFunction<Integer, Integer, Integer> {
    public Integer apply(Integer old, Integer new_) {
        return ++old;
    }
}


public final class TechProfile {

    private String[] _ruleNames;

    private Increment increment = new Increment();

    private HashMap<String, Integer> _data = new HashMap<>();

    public int[] data;

    public int nodes_visited = 0;

    public TechProfile(String[] ruleNames) {
        _ruleNames = ruleNames;
        data = new int[_ruleNames.length];
    }

    public TechProfile() {
        // load dummy data
        data = new int[1];
        _ruleNames = new String[1];
        _ruleNames[0] = "";
    }

    public String[] getRuleNames() { return _ruleNames; }

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
            for (int i=0; i<data.length; i++) {
                map.put(_ruleNames[i], data[i]);
            }
            return map;
        }
        return _data;
    }

}


