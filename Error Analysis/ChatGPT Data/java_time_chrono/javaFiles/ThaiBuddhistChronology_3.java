import java.time.chrono.ThaiBuddhistChronology;
import java.time.chrono.ThaiBuddhistEra;

public class ThaiBuddhistChronology_3 {
    public static void main(String[] args) {
        ThaiBuddhistEra era = ThaiBuddhistChronology.INSTANCE.eraOf(1);
        System.out.println("Thai Buddhist Era 1: " + era.toString());
    }
}
