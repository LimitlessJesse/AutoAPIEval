import java.util.LongSummaryStatistics;
import java.util.stream.LongStream;

public class LongSummaryStatistics_3 {
    public static void main(String[] args) {
        LongStream longStream = LongStream.of(1, 2, 3, 4, 5);
        LongSummaryStatistics stats = longStream.summaryStatistics();
        
        double average = stats.getAverage();
        
        System.out.println("Average: " + average);
    }
}
