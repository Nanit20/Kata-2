package práctica.pkg2;

public class Histogram {
    private Object counts;
    private final Map<Integer, Integer>

    Histogram(int... values) {
        for (int value:values)
            counts.put(value, counts.get(value)+1);
    }
    
    public Set<Integer> getValues(){
        return counts.ketSet();
    }

    public int getCount (int value){
        return counts.get(value);
    }
    
}
