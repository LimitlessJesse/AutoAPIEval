import java.time.LocalDateTime;

public class LocalDateTime_21 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + dateTime);

        LocalDateTime newDateTime = dateTime.plusDays(1);
        System.out.println("Date and time after adding one day: " + newDateTime);
    }
}
