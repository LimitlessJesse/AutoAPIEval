import java.time.chrono.MinguoChronology;
import java.time.chrono.MinguoDate;

public class MinguoChronology_2 {
    public static void main(String[] args) {
        MinguoDate date = MinguoChronology.INSTANCE.date(110, 10, 10);
        System.out.println("Minguo Date: " + date);
    }
}
