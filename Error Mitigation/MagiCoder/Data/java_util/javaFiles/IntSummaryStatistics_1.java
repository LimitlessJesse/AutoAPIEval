import java.util.IntSummaryStatistics;

public class IntSummaryStatistics_1 {
    public static void main(String[] args) {
        IntSummaryStatistics stats = new IntSummaryStatistics();
        stats.accept(1);
        stats.accept(2);
        stats.accept(3);
        System.out.println(stats.getCount());
    }
}
