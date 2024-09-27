import java.time.LocalDateTime;

public class LocalDateTime_13 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Original date-time: " + dateTime);

        LocalDateTime newDateTime = dateTime.withDayOfMonth(15);
        System.out.println("New date-time with day of month set to 15: " + newDateTime);
    }
}
