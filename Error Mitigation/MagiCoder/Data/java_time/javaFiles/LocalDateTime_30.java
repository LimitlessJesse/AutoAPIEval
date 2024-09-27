import java.time.LocalDateTime;

public class LocalDateTime_30 {
    public static void main(String[] args) {
        // Create a LocalDateTime object
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Original date-time: " + dateTime);

        // Subtract 5 hours
        LocalDateTime newDateTime = dateTime.minusHours(5);
        System.out.println("Date-time after subtracting 5 hours: " + newDateTime);
    }
}
