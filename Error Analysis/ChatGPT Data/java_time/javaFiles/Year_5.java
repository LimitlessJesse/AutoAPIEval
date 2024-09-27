import java.time.Year;
import java.time.temporal.TemporalAdjusters;

public class Year_5 {
    public static void main(String[] args) {
        Year year = Year.now();
        Year adjustedYear = year.with(TemporalAdjusters.lastDayOfYear());
        
        System.out.println("Current year: " + year);
        System.out.println("Last day of the current year: " + adjustedYear);
    }
}
