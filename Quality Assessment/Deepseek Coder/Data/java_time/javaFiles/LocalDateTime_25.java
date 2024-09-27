import java.time.LocalDateTime;

public class LocalDateTime_25 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        LocalDateTime minusWeeks = now.minusWeeks(2);
        System.out.println("Date and time 2 weeks ago: " + minusWeeks);
    }
}
