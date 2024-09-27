import java.time.chrono.HijrahChronology;
import java.time.chrono.HijrahDate;
import java.time.temporal.TemporalAccessor;

public class HijrahChronology_5 {
    public static void main(String[] args) {
        TemporalAccessor temporal = HijrahChronology.INSTANCE.dateNow();
        HijrahDate hijrahDate = HijrahDate.from(temporal);
        System.out.println("Hijrah Date: " + hijrahDate);
    }
}
