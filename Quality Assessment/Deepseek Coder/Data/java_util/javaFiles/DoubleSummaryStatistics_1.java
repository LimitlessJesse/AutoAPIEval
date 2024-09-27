import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;

public class DoubleSummaryStatistics_1 {
    public static void main(String[] args) {
        DoubleSummaryStatistics stats = DoubleStream.of(1.1, 2.2, 3.3)
                                                   .summaryStatistics();
        double sum = stats.getSum();
        System.out.println("Sum: " + sum);
    }
}
