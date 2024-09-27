import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTime_6 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        System.out.println("Current Hour: " + hour);
    }
}
