import java.time.temporal.TemporalAdjusters;
import java.time.LocalDate;

public class TemporalAdjusters_4 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2011, 1, 15);
        System.out.println("Input date: " + date);
        
        LocalDate firstDayOfYear = date.with(TemporalAdjusters.firstDayOfYear());
        System.out.println("First day of year: " + firstDayOfYear);
    }
}
