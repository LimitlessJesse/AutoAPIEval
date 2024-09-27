import java.time.Year;

public class Year_3 {
    public static void main(String[] args) {
        Year year = Year.now();
        boolean isLeapYear = year.isLeap();
        System.out.println("Is the current year a leap year? " + isLeapYear);
    }
}
