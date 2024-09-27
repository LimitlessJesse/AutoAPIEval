import java.time.chrono.HijrahChronology;
import java.time.chrono.HijrahDate;

public class HijrahChronology_1 {
    public static void main(String[] args) {
        HijrahChronology hijrahChronology = HijrahChronology.INSTANCE;
        HijrahDate hijrahDate = hijrahChronology.date(1443, 9, 23);
        System.out.println("Hijrah Date: " + hijrahDate);
    }
}
