import java.time.LocalDateTime;

public class LocalDateTime_16 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Original date-time: " + dateTime);

        LocalDateTime newDateTime = dateTime.withSecond(30);
        System.out.println("Date-time with new second: " + newDateTime);
    }
}
