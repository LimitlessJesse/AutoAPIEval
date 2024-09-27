import java.time.LocalDateTime;

public class LocalDateTime_20 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + dateTime);

        LocalDateTime newDateTime = dateTime.plusWeeks(2);
        System.out.println("Date and time after adding 2 weeks: " + newDateTime);
    }
}
