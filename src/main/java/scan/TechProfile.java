package scan;

import java.util.HashMap;


public final class TechProfile {

    private String[] _ruleNames;

    public int[] data;

    public int nodes_visited = 0;

    public TechProfile(String[] ruleNames) {
        _ruleNames = ruleNames;
        data = new int[_ruleNames.length];
    }

    public TechProfile() {
    }

    public String[] getRuleNames() { return _ruleNames; }

    public void merge(TechProfile in) {
        int[] indata = in.data;
        for (int i=0; i < data.length; i++ ) {
            data[i] += indata[i];
        }
    }

    public HashMap<String, Integer> toMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i=0; i<data.length; i++) {
            map.put(_ruleNames[i], data[i]);
        }
        return map;
    }

}


