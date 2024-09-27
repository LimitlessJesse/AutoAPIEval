import java.time.chrono.IsoChronology;
import java.time.chrono.IsoEra;

public class IsoChronology_3 {
    public static void main(String[] args) {
        IsoEra isoEra = IsoChronology.INSTANCE.eraOf(1);
        System.out.println("IsoEra: " + isoEra);
    }
}
