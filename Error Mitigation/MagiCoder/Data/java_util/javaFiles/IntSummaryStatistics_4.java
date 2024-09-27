import java.util.IntSummaryStatistics;

public class IntSummaryStatistics_4 {
    public static void main(String[] args) {
        IntSummaryStatistics stats = new IntSummaryStatistics();
        stats.accept(10);
        stats.accept(20);
        stats.accept(30);
        System.out.println("Min: " + stats.getMin());
    }
}
