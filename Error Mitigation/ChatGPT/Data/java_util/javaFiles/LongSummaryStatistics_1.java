import java.util.LongSummaryStatistics;

public class LongSummaryStatistics_1 {
    public static void main(String[] args) {
        LongSummaryStatistics stats = new LongSummaryStatistics();
        stats.accept(10);
        stats.accept(20);
        stats.accept(30);
        
        long count = stats.getCount();
        System.out.println("Count of values: " + count);
    }
}
