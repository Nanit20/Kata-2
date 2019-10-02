package práctica.pkg2;
public class Main {
    public static void main(String[] args) {
        Histogram histogram = new Histogram (4,3,8,1,5,5,5,7,7,6,3,14,45,45,-45);
        HistogramDisplay display = new HistogramDisplay(histogram);
        display.execute();
        
    }
}
