import java.time.LocalDateTime;

public class LocalDateTime_24 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Original date-time: " + dateTime);

        LocalDateTime newDateTime = dateTime.plusSeconds(30);
        System.out.println("Date-time after adding 30 seconds: " + newDateTime);
    }
}
