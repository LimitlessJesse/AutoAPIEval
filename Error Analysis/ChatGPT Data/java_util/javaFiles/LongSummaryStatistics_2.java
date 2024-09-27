import java.util.LongSummaryStatistics;
import java.util.stream.LongStream;

public class LongSummaryStatistics_2 {
    public static void main(String[] args) {
        LongSummaryStatistics stats = LongStream.of(1, 2, 3, 4, 5)
                .summaryStatistics();
        long sum = stats.getSum();
        System.out.println("Sum of the numbers: " + sum);
    }
}
