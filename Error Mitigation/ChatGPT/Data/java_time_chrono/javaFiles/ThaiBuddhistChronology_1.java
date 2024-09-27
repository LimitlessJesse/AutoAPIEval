import java.time.chrono.ThaiBuddhistChronology;
import java.time.chrono.ThaiBuddhistDate;

public class ThaiBuddhistChronology_1 {
    public static void main(String[] args) {
        ThaiBuddhistChronology chronology = ThaiBuddhistChronology.INSTANCE;
        ThaiBuddhistDate thaiBuddhistDate = chronology.date(2564, 9, 13);
        System.out.println("Thai Buddhist Date: " + thaiBuddhistDate);
    }
}
