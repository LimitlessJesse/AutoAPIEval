import java.util.IntSummaryStatistics;

public class IntSummaryStatistics_1 {
    public static void main(String[] args) {
        IntSummaryStatistics stats = new IntSummaryStatistics();
        stats.accept(10);
        stats.accept(20);
        stats.accept(30);
        
        long count = stats.getCount();
        System.out.println("Count of values: " + count);
    }
}
