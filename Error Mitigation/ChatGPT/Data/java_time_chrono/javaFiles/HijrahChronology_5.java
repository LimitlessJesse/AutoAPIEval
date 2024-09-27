import java.time.Clock;
import java.time.chrono.HijrahChronology;
import java.time.chrono.HijrahDate;

public class HijrahChronology_5 {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        HijrahDate currentDate = HijrahChronology.INSTANCE.dateNow(clock);
        System.out.println("Current Hijrah Date: " + currentDate);
    }
}
