import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;

public class DoubleSummaryStatistics_4 {
    public static void main(String[] args) {
        DoubleSummaryStatistics stats = DoubleStream.of(1.1, 2.2, 3.3, 4.4, 5.5)
               .summaryStatistics();
        double max = stats.getMax();
        System.out.println("Maximum value: " + max);
    }
}
