import java.time.LocalDate;

public class LocalDate_9 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Current date: " + date);

        LocalDate nextDate = date.plusDays(1);
        System.out.println("Date after adding one day: " + nextDate);
    }
}
