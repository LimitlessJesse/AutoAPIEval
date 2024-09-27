import java.time.temporal.TemporalAdjusters;
import java.time.LocalDate;

public class TemporalAdjusters_1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2011, 1, 15);
        LocalDate firstDayOfMonth = date.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("Input date: " + date);
        System.out.println("First day of month: " + firstDayOfMonth);
    }
}
