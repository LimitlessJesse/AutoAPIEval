import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTime_4 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        Month month = now.getMonth();
        System.out.println("Current month: " + month);
    }
}
