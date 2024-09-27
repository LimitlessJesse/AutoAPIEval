import java.time.LocalDateTime;

public class LocalDateTime_25 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Original date-time: " + dateTime);

        LocalDateTime newDateTime = dateTime.plusNanos(1000000000);
        System.out.println("Date-time after adding 1 second: " + newDateTime);
    }
}
