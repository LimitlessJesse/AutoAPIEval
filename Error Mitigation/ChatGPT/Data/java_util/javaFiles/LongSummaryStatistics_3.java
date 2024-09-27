import java.util.LongSummaryStatistics;

public class LongSummaryStatistics_3 {
    public static void main(String[] args) {
        LongSummaryStatistics stats = new LongSummaryStatistics();
        stats.accept(10);
        stats.accept(20);
        stats.accept(5);
        
        long min = stats.getMin();
        System.out.println("Minimum value: " + min);
    }
}
