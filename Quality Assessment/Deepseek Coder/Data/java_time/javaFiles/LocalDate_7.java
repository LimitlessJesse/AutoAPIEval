import java.time.LocalDate;

public class LocalDate_7 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        boolean isLeapYear = date.isLeapYear();
        System.out.println("Is the current year a leap year? " + isLeapYear);
    }
}
