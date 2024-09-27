import java.util.IntSummaryStatistics;

public class IntSummaryStatistics_5 {
    public static void main(String[] args) {
        IntSummaryStatistics stats = new IntSummaryStatistics();
        stats.accept(10);
        stats.accept(20);
        stats.accept(30);
        
        int max = stats.getMax();
        System.out.println("Max value: " + max);
    }
}
