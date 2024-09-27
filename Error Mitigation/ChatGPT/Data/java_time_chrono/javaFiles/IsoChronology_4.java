import java.time.chrono.IsoChronology;
import java.time.chrono.IsoEra;

public class IsoChronology_4 {
    public static void main(String[] args) {
        IsoChronology isoChronology = IsoChronology.INSTANCE;
        IsoEra era = isoChronology.eraOf(1);
        System.out.println("Era: " + era);
    }
}
