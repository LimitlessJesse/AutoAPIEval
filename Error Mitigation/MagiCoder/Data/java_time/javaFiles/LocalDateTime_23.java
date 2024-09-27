import java.time.LocalDateTime;

public class LocalDateTime_23 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Original date-time: " + dateTime);

        LocalDateTime newDateTime = dateTime.plusMinutes(5);
        System.out.println("Date-time after adding 5 minutes: " + newDateTime);
    }
}
