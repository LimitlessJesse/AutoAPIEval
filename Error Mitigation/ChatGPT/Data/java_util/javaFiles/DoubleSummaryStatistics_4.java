import java.util.DoubleSummaryStatistics;

public class DoubleSummaryStatistics_4 {
    public static void main(String[] args) {
        DoubleSummaryStatistics stats = new DoubleSummaryStatistics();
        stats.accept(10.5);
        stats.accept(20.3);
        stats.accept(5.7);
        
        double min = stats.getMin();
        System.out.println("Minimum value: " + min);
    }
}
