import java.time.chrono.HijrahDate;

public class HijrahDate_14 {
    public static void main(String[] args) {
        HijrahDate date = HijrahDate.now();
        boolean isLeapYear = date.isLeapYear();
        System.out.println("Is the current year a leap year? " + isLeapYear);
    }
}
