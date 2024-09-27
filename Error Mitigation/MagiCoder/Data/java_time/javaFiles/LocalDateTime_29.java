import java.time.LocalDateTime;

public class LocalDateTime_29 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + dateTime);

        LocalDateTime dateTimeMinusDays = dateTime.minusDays(10);
        System.out.println("Date and time minus 10 days: " + dateTimeMinusDays);
    }
}
