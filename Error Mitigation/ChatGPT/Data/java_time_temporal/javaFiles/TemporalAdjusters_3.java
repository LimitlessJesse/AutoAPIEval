import java.time.temporal.TemporalAdjusters;
import java.time.LocalDate;

public class TemporalAdjusters_3 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2011, 1, 15);
        System.out.println("Input date: " + date);
        
        TemporalAdjuster adjuster = TemporalAdjusters.firstDayOfNextMonth();
        LocalDate nextMonthFirstDay = date.with(adjuster);
        
        System.out.println("First day of next month: " + nextMonthFirstDay);
    }
}
