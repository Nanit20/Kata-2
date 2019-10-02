package práctica.pkg2;
public class Main {
    public static void main(String[] args) {
        Histogram histogram = new Histogram (4,3,8,4,5,1);
        for (int value: histogram.getValues()){
            System.out.println(value + " " + histogram.getCount())
        }
        
    }
}
