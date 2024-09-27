import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class LocalDate_44 {
    public static void main(String[] args) {
        // Create a LocalDate object
        LocalDate date = LocalDate.now();
        System.out.println("Original date: " + date);

        // Adjust the date to the last day of the month
        LocalDate lastDayOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last day of the month: " + lastDayOfMonth);
    }
}
