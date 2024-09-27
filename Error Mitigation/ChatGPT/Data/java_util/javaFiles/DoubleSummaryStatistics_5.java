import java.util.DoubleSummaryStatistics;

public class DoubleSummaryStatistics_5 {
    public static void main(String[] args) {
        DoubleSummaryStatistics stats = new DoubleSummaryStatistics();
        stats.accept(10.5);
        stats.accept(20.3);
        stats.accept(15.7);
        
        double max = stats.getMax();
        System.out.println("Maximum recorded value: " + max);
    }
}
