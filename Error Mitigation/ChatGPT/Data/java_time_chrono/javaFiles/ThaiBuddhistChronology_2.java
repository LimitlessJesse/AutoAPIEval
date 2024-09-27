import java.time.chrono.Era;
import java.time.chrono.ThaiBuddhistChronology;
import java.time.chrono.ThaiBuddhistDate;

public class ThaiBuddhistChronology_2 {
    public static void main(String[] args) {
        Era era = ThaiBuddhistChronology.INSTANCE.eraOf(1);
        ThaiBuddhistDate thaiDate = ThaiBuddhistChronology.INSTANCE.date(era, 2564, 10, 15);
        System.out.println("Thai Buddhist Date: " + thaiDate);
    }
}
