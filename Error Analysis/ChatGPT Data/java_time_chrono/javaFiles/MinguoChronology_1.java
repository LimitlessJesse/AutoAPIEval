import java.time.chrono.MinguoChronology;
import java.time.chrono.MinguoDate;

public class MinguoChronology_1 {
    public static void main(String[] args) {
        MinguoDate dateNow = MinguoChronology.INSTANCE.dateNow();
        System.out.println("MinguoDate now: " + dateNow);
    }
}
