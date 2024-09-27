import java.time.Year;

public class Year_2 {
    public static void main(String[] args) {
        Year year = Year.of(2000);
        boolean isLeapYear = year.isLeap();
        System.out.println("Is 2000 a leap year? " + isLeapYear);
    }
}
