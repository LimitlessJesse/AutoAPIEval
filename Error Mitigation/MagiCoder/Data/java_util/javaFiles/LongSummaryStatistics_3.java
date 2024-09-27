import java.util.LongSummaryStatistics;

public class LongSummaryStatistics_3 {
    public static void main(String[] args) {
        LongSummaryStatistics stats = new LongSummaryStatistics();
        stats.accept(10L);
        stats.accept(20L);
        stats.accept(30L);
        System.out.println("Min: " + stats.getMin());
    }
}
