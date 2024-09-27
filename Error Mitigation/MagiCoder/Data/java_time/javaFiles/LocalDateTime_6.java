import java.time.LocalDateTime;

public class LocalDateTime_6 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        int dayOfMonth = dateTime.getDayOfMonth();
        System.out.println("Current day of the month: " + dayOfMonth);
    }
}
