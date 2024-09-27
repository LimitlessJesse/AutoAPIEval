import java.time.LocalDateTime;

public class LocalDateTime_4 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2008, 12, 31, 0, 0);
        LocalDateTime newDateTime = dateTime.plusDays(1);
        System.out.println("Original date: " + dateTime);
        System.out.println("Date after adding 1 day: " + newDateTime);
    }
}
