import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTime_12 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime: " + localDateTime);

        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println("LocalTime: " + localTime);
    }
}
