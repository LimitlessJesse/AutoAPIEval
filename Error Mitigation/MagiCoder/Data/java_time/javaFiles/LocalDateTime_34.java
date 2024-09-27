import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTime_34 {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2022, 1, 1, 0, 0);
        LocalDateTime end = LocalDateTime.of(2022, 1, 2, 0, 0);

        long days = start.until(end, ChronoUnit.DAYS);

        System.out.println("Number of days between start and end: " + days);
    }
}
