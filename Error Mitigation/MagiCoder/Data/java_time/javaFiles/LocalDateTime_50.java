import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class LocalDateTime_50 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Original date-time: " + dateTime);

        LocalDateTime newDateTime = dateTime.with(ChronoField.YEAR, 2022);
        System.out.println("New date-time with year 2022: " + newDateTime);
    }
}
