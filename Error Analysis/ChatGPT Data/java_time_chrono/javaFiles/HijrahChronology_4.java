import java.time.chrono.HijrahDate;
import java.time.chrono.HijrahChronology;

public class HijrahChronology_4 {
    public static void main(String[] args) {
        HijrahDate now = HijrahDate.now(HijrahChronology.INSTANCE);
        System.out.println("Current Hijrah date: " + now);
    }
}
