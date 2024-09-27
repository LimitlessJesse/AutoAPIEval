import java.time.LocalDateTime;

public class LocalDateTime_17 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        LocalDateTime future = now.plusWeeks(2);
        System.out.println("Date and time after 2 weeks: " + future);
    }
}
