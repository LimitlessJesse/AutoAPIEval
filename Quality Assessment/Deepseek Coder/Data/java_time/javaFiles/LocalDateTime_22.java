import java.time.LocalDateTime;

public class LocalDateTime_22 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + dateTime);

        LocalDateTime newDateTime = dateTime.plusNanos(500_000_000);
        System.out.println("New date and time after adding 500 milliseconds: " + newDateTime);
    }
}
