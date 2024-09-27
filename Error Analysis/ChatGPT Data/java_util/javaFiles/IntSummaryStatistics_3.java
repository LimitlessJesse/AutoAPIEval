import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntSummaryStatistics_3 {
    public static void main(String[] args) {
        IntSummaryStatistics stats = IntStream.of(1, 2, 3, 4, 5)
                .summaryStatistics();
        
        double average = stats.getAverage();
        System.out.println(average);
    }
}
