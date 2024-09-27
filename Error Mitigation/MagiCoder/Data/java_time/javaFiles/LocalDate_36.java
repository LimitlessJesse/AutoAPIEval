import java.time.LocalDate;

public class LocalDate_36 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 12, 31);
        System.out.println("Original date: " + date);

        LocalDate newDate = date.withDayOfMonth(28);
        System.out.println("Date with changed day: " + newDate);
    }
}
