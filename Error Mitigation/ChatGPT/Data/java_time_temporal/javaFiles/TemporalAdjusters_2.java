import java.time.temporal.TemporalAdjusters;
import java.time.LocalDate;

public class TemporalAdjusters_2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2011, 1, 15);
        LocalDate lastDayOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Input date: " + date);
        System.out.println("Last day of month: " + lastDayOfMonth);
    }
}
