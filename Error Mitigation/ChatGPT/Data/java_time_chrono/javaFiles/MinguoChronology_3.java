import java.time.chrono.MinguoChronology;
import java.time.chrono.MinguoDate;

public class MinguoChronology_3 {
    public static void main(String[] args) {
        MinguoChronology minguoChrono = MinguoChronology.INSTANCE;
        MinguoDate minguoDate = minguoChrono.date(2022, 10, 15);
        System.out.println("Minguo Date: " + minguoDate);
    }
}
