import java.time.LocalDateTime;

public class LocalDateTime_15 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Original date-time: " + dateTime);

        LocalDateTime newDateTime = dateTime.withMinute(30);
        System.out.println("Date-time with minute set to 30: " + newDateTime);
    }
}
