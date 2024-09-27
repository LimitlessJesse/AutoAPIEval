import java.time.LocalDateTime;

public class LocalDateTime_12 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Original date-time: " + dateTime);

        LocalDateTime newDateTime = dateTime.withMonth(12);
        System.out.println("Date-time with changed month: " + newDateTime);
    }
}
