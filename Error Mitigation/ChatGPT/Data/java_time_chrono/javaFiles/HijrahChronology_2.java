import java.time.chrono.HijrahChronology;
import java.time.chrono.HijrahDate;
import java.time.temporal.TemporalAccessor;

public class HijrahChronology_2 {
    public static void main(String[] args) {
        HijrahChronology hijrahChronology = HijrahChronology.INSTANCE;
        TemporalAccessor temporalAccessor = hijrahChronology.dateNow();
        HijrahDate hijrahDate = hijrahChronology.date(temporalAccessor);
        System.out.println("Hijrah Date: " + hijrahDate);
    }
}
