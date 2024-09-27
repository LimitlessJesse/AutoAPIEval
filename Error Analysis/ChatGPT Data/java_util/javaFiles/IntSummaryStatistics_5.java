import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntSummaryStatistics_5 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        IntSummaryStatistics stats = intStream.summaryStatistics();
        
        int max = stats.getMax();
        
        System.out.println("Max value: " + max);
    }
}
