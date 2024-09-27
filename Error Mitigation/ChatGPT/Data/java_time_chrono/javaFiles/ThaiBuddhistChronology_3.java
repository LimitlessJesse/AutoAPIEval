import java.time.chrono.ThaiBuddhistChronology;
import java.time.chrono.ThaiBuddhistDate;

public class ThaiBuddhistChronology_3 {
    public static void main(String[] args) {
        ThaiBuddhistChronology chronology = ThaiBuddhistChronology.INSTANCE;
        ThaiBuddhistDate thaiBuddhistDate = chronology.dateYearDay(2564, 100);
        System.out.println("Thai Buddhist Date: " + thaiBuddhistDate);
    }
}
