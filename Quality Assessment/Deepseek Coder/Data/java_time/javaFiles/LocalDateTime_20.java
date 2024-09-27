import java.time.LocalDateTime;

public class LocalDateTime_20 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        LocalDateTime plusMinutes = now.plusMinutes(30);
        System.out.println("Date and time after adding 30 minutes: " + plusMinutes);
    }
}
