import java.time.chrono.Era;
import java.time.chrono.ThaiBuddhistChronology;
import java.time.chrono.ThaiBuddhistDate;

public class ThaiBuddhistChronology_4 {
    public static void main(String[] args) {
        Era era = ThaiBuddhistChronology.INSTANCE.eraOf(1);
        ThaiBuddhistDate thaiDate = ThaiBuddhistChronology.INSTANCE.dateYearDay(era, 2564, 100);
        System.out.println("Thai Buddhist Date: " + thaiDate);
    }
}
