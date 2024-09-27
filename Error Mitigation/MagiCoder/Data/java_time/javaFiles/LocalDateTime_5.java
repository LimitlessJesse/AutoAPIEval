import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTime_5 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        Month month = dateTime.getMonth();
        System.out.println("Current Month: " + month);
    }
}
