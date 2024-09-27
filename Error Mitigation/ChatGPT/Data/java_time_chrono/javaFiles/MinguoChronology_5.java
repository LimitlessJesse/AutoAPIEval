import java.time.chrono.MinguoChronology;
import java.time.chrono.MinguoDate;

public class MinguoChronology_5 {
    public static void main(String[] args) {
        MinguoChronology minguoChrono = MinguoChronology.INSTANCE;
        MinguoDate minguoDate = minguoChrono.dateYearDay(2022, 100);
        System.out.println("Minguo Date: " + minguoDate);
    }
}
