import java.time.LocalDateTime;

public class LocalDateTime_31 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Original date-time: " + dateTime);

        LocalDateTime newDateTime = dateTime.minusMinutes(30);
        System.out.println("Date-time after subtracting 30 minutes: " + newDateTime);
    }
}
