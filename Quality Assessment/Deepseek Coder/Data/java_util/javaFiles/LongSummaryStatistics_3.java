import java.util.stream.LongStream;
import java.util.LongSummaryStatistics;

public class LongSummaryStatistics_3 {
    public static void main(String[] args) {
        LongSummaryStatistics stats = LongStream.of(1, 2, 3, 4, 5).summaryStatistics();
        System.out.println("Min: " + stats.getMin());
    }
}
