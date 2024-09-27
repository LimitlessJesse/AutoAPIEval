import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDate_17 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2022, 1, 1);
        LocalDate endDate = LocalDate.of(2022, 1, 10);

        long days = startDate.until(endDate, ChronoUnit.DAYS);

        System.out.println("Number of days between " + startDate + " and " + endDate + " is: " + days);
    }
}
