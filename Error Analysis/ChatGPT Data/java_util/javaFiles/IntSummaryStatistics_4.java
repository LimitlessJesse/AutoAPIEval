import java.util.IntSummaryStatistics;

public class IntSummaryStatistics_4 {
    public static void main(String[] args) {
        IntSummaryStatistics stats = new IntSummaryStatistics();
        stats.accept(10);
        stats.accept(5);
        stats.accept(15);
        
        int min = stats.getMin();
        System.out.println("Minimum value: " + min);
    }
}
