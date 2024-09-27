import java.time.LocalDateTime;
import java.time.DayOfWeek;

public class LocalDateTime_10 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println(dayOfWeek);
    }
}
