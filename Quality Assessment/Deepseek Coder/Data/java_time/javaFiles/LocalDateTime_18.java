import java.time.LocalDateTime;

public class LocalDateTime_18 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        LocalDateTime future = now.plusDays(2);
        System.out.println("Date and time 2 days from now: " + future);
    }
}
