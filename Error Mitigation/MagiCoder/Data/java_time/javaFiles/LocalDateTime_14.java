import java.time.LocalDateTime;

public class LocalDateTime_14 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Original date-time: " + dateTime);

        LocalDateTime newDateTime = dateTime.withHour(15);
        System.out.println("Date-time with changed hour: " + newDateTime);
    }
}
