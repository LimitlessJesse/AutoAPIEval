import java.time.chrono.HijrahDate;
import java.time.temporal.TemporalAdjuster;

public class HijrahDate_3 {
    public static void main(String[] args) {
        HijrahDate date = HijrahDate.now();
        
        TemporalAdjuster adjuster = temporal -> temporal.plus(1, YEARS);
        HijrahDate adjustedDate = date.with(adjuster);
        
        System.out.println("Original date: " + date);
        System.out.println("Adjusted date: " + adjustedDate);
    }
}
