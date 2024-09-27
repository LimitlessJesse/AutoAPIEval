import java.time.LocalDateTime;

public class LocalDateTime_19 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Original date and time: " + dateTime);

        LocalDateTime newDateTime = dateTime.plusMonths(2);
        System.out.println("Date and time after adding 2 months: " + newDateTime);
    }
}
