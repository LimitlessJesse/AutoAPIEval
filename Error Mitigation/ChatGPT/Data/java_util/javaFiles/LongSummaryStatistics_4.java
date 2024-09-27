import java.util.LongSummaryStatistics;

public class LongSummaryStatistics_4 {
    public static void main(String[] args) {
        LongSummaryStatistics stats = new LongSummaryStatistics();
        stats.accept(10);
        stats.accept(20);
        stats.accept(30);
        
        long max = stats.getMax();
        System.out.println("Max value: " + max);
    }
}
