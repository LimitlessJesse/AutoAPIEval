import java.time.Clock;
import java.time.chrono.MinguoChronology;
import java.time.chrono.MinguoDate;

public class MinguoChronology_5 {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        MinguoDate minguoDate = MinguoChronology.INSTANCE.dateNow(clock);
        System.out.println("Minguo Date Now: " + minguoDate);
    }
}
