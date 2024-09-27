import java.time.chrono.HijrahChronology;
import java.time.chrono.HijrahEra;

public class HijrahChronology_3 {
    public static void main(String[] args) {
        HijrahChronology hijrahChronology = HijrahChronology.INSTANCE;
        HijrahEra era = hijrahChronology.eraOf(1);
        System.out.println("Era name: " + era.toString());
    }
}
