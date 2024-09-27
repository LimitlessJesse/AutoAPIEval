import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime_11 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2022, 12, 31, 10, 15, 30);
        System.out.println("Original date-time: " + dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        LocalDateTime newDateTime = dateTime.withYear(2023);
        System.out.println("Date-time with new year: " + newDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
