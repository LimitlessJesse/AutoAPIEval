import java.time.LocalDateTime;

public class LocalDateTime_28 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + dateTime);

        LocalDateTime newDateTime = dateTime.minusWeeks(2);
        System.out.println("Date and time after subtracting 2 weeks: " + newDateTime);
    }
}
