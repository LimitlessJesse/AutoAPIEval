import java.time.chrono.HijrahChronology;
import java.time.chrono.HijrahDate;

public class HijrahChronology_2 {
    public static void main(String[] args) {
        HijrahChronology chrono = HijrahChronology.INSTANCE;
        HijrahDate date = chrono.date(2022, 1, 1);
        System.out.println(date);
    }
}
