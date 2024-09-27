import java.util.LongSummaryStatistics;

public class LongSummaryStatistics_2 {
    public static void main(String[] args) {
        LongSummaryStatistics stats = new LongSummaryStatistics();
        stats.accept(10);
        stats.accept(20);
        stats.accept(30);
        
        long sum = stats.getSum();
        System.out.println("Sum: " + sum);
    }
}
