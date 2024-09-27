import java.time.LocalDateTime;

public class LocalDateTime_29 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + dateTime);

        LocalDateTime newDateTime = dateTime.minusSeconds(5);
        System.out.println("New DateTime after subtracting 5 seconds: " + newDateTime);
    }
}
