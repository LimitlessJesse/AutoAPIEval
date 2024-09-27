import java.time.LocalDateTime;

public class LocalDateTime_27 {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        // Subtract 5 hours from the current date and time
        LocalDateTime fiveHoursAgo = now.minusHours(5);
        System.out.println("Date and time 5 hours ago: " + fiveHoursAgo);
    }
}
