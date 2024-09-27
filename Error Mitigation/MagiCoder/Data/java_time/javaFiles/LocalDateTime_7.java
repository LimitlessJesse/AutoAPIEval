import java.time.LocalDateTime;

public class LocalDateTime_7 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        System.out.println("Current hour: " + hour);
    }
}
