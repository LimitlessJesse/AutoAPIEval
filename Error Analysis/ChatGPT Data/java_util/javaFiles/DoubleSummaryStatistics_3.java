import java.util.DoubleSummaryStatistics;

public class DoubleSummaryStatistics_3 {
    public static void main(String[] args) {
        // Create a DoubleSummaryStatistics object
        DoubleSummaryStatistics stats = new DoubleSummaryStatistics();
        
        // Add values to the statistics object
        stats.accept(10.5);
        stats.accept(20.7);
        stats.accept(15.3);
        
        // Get the sum of all added values
        double sum = stats.getSum();
        
        System.out.println("Sum of values: " + sum);
    }
}
