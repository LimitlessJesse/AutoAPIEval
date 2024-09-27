import java.util.LongSummaryStatistics;
import java.util.stream.LongStream;

public class LongSummaryStatistics_5 {
    public static void main(String[] args) {
        LongStream stream = LongStream.of(1, 2, 3, 4, 5);
        LongSummaryStatistics stats = stream.summaryStatistics();

        long min = stats.getMin();
        System.out.println("Minimum value: " + min);
    }
}
