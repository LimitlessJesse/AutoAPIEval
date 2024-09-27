import java.util.stream.LongStream;
import java.util.LongSummaryStatistics;

public class LongSummaryStatistics_2 {
    public static void main(String[] args) {
        LongStream stream = LongStream.of(1, 2, 3, 4, 5);
        LongSummaryStatistics stats = stream.summaryStatistics();
        System.out.println("Sum: " + stats.getSum());
    }
}
