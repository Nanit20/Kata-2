package práctica.pkg2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    
    private final Map<Integer, Integer> counts= new HashMap<>();

    Histogram(int... values) {
        for (int value:values)
            counts.put(value, counts.get(value)+1);
    }
    
    public Set<Integer> getValues(){
        return counts.keySet();
    }

    public int getCount (int value){
        return counts.get(value);
    }
    
}
