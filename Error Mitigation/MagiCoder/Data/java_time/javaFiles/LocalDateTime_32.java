import java.time.LocalDateTime;

public class LocalDateTime_32 {
    public static void main(String[] args) {
        // Create a LocalDateTime object
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Original LocalDateTime: " + dateTime);

        // Subtract 5 seconds from the LocalDateTime
        LocalDateTime newDateTime = dateTime.minusSeconds(5);
        System.out.println("LocalDateTime after subtracting 5 seconds: " + newDateTime);
    }
}
