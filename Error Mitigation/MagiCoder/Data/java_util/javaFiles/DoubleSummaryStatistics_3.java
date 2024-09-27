import java.util.DoubleSummaryStatistics;

public class DoubleSummaryStatistics_3 {
    public static void main(String[] args) {
        DoubleSummaryStatistics stats = new DoubleSummaryStatistics();
        stats.accept(1.0);
        stats.accept(2.0);
        stats.accept(3.0);
        stats.accept(Double.NaN);
        stats.accept(Double.POSITIVE_INFINITY);

        double min = stats.getMin();
        System.out.println("Min: " + min);
    }
}
