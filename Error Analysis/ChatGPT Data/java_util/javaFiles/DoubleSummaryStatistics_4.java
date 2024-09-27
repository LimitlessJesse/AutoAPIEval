import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;

public class DoubleSummaryStatistics_4 {
    public static void main(String[] args) {
        double[] numbers = {2.5, 3.7, 1.8, 4.2, 5.6};
        
        DoubleSummaryStatistics stats = DoubleStream.of(numbers).summaryStatistics();
        double average = stats.getAverage();
        
        System.out.println("Average: " + average);
    }
}
