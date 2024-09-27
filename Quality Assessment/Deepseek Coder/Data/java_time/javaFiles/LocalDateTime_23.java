import java.time.LocalDateTime;

public class LocalDateTime_23 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        LocalDateTime minusFiveYears = now.minusYears(5);
        System.out.println("Date and time 5 years ago: " + minusFiveYears);
    }
}
