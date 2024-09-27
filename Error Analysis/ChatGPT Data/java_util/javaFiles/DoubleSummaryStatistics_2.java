import java.util.DoubleSummaryStatistics;

public class DoubleSummaryStatistics_2 {
    public static void main(String[] args) {
        DoubleSummaryStatistics stats = new DoubleSummaryStatistics();
        stats.accept(10.5);
        stats.accept(20.3);
        stats.accept(30.8);
        
        long count = stats.getCount();
        System.out.println("Count: " + count);
    }
}
