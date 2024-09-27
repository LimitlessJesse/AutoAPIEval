import java.time.chrono.HijrahDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class HijrahDate_31 {
    public static void main(String[] args) {
        HijrahDate date = HijrahDate.now();
        HijrahDate adjustedDate = date.with(TemporalAdjusters.next(TemporalAdjusters.WEDNESDAY));
        System.out.println("Original date: " + date);
        System.out.println("Adjusted date: " + adjustedDate);
    }
}
