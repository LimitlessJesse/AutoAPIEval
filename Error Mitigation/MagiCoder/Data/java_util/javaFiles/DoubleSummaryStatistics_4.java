import java.util.DoubleSummaryStatistics;

public class DoubleSummaryStatistics_4 {
    public static void main(String[] args) {
        DoubleSummaryStatistics stats = new DoubleSummaryStatistics();
        stats.accept(1.0);
        stats.accept(2.0);
        stats.accept(3.0);
        stats.accept(Double.NaN);
        stats.accept(Double.NEGATIVE_INFINITY);

        double max = stats.getMax();
        System.out.println("Max: " + max);
    }
}
