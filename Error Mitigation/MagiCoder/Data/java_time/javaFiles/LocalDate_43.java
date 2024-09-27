import java.time.LocalDate;

public class LocalDate_43 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 1, 1);
        System.out.println("Original date: " + date);

        LocalDate newDate = date.withDayOfYear(150);
        System.out.println("Date with changed day of year: " + newDate);
    }
}
