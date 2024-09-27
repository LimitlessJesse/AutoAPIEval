import java.time.chrono.IsoChronology;

public class IsoChronology_2 {
    public static void main(String[] args) {
        IsoChronology isoChronology = IsoChronology.INSTANCE;
        long year = 2000;
        boolean isLeapYear = isoChronology.isLeapYear(year);
        System.out.println("Is " + year + " a leap year? " + isLeapYear);
    }
}
