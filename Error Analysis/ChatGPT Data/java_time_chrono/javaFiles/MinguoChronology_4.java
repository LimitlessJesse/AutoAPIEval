import java.time.chrono.MinguoChronology;
import java.time.chrono.MinguoEra;

public class MinguoChronology_4 {
    public static void main(String[] args) {
        MinguoEra era = MinguoChronology.INSTANCE.eraOf(1);
        System.out.println("Minguo Era: " + era);
    }
}
