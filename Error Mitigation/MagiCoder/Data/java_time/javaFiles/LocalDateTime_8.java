import java.time.LocalDateTime;

public class LocalDateTime_8 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int minute = now.getMinute();
        System.out.println("Current minute: " + minute);
    }
}
