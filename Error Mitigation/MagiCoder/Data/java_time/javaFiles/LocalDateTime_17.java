import java.time.LocalDateTime;

public class LocalDateTime_17 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Original date-time: " + dateTime);

        LocalDateTime newDateTime = dateTime.withNano(500000000);
        System.out.println("Date-time with new nano: " + newDateTime);
    }
}
