import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntSummaryStatistics_2 {
    public static void main(String[] args) {
        IntSummaryStatistics stats = IntStream.range(1, 6).summaryStatistics();
        long sum = stats.getSum();
        System.out.println("Sum: " + sum);
    }
}
