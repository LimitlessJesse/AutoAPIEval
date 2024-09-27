import java.time.LocalDate;

public class LocalDate_8 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, 1, 1);
        boolean isLeapYear = date.isLeapYear();
        System.out.println("Is 2020 a leap year? " + isLeapYear);
    }
}
