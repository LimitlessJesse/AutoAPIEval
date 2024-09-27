import java.time.chrono.IsoChronology;

public class IsoChronology_2 {
    public static void main(String[] args) {
        long year = 2021;
        boolean isLeapYear = IsoChronology.INSTANCE.isLeapYear(year);
        System.out.println("Is " + year + " a leap year? " + isLeapYear);
    }
}
