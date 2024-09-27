import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntSummaryStatistics_1 {
    public static void main(String[] args) {
        IntSummaryStatistics stats = IntStream.range(1, 11)
                .summaryStatistics();

        long count = stats.getCount();

        System.out.println("Count: " + count);
    }
}
