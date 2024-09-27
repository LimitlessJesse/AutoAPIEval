import java.time.LocalDate;

public class LocalDate_19 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 1, 1);
        LocalDate newDate = date.withDayOfMonth(15);
        System.out.println("Original Date: " + date);
        System.out.println("New Date: " + newDate);
    }
}
