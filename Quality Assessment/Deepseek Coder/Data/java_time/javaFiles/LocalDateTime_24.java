import java.time.LocalDateTime;

public class LocalDateTime_24 {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        // Subtract 5 months from the current date and time
        LocalDateTime minus5Months = now.minusMonths(5);
        System.out.println("Date and time 5 months ago: " + minus5Months);
    }
}
