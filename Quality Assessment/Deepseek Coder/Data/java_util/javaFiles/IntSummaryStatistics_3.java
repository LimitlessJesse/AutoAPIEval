import java.util.stream.IntStream;

public class IntSummaryStatistics_3 {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        java.util.IntSummaryStatistics stats = stream.summaryStatistics();
        int min = stats.getMin();
        System.out.println("Minimum value: " + min);
    }
}
