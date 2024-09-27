import java.time.LocalDateTime;

public class LocalDateTime_28 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current DateTime: " + now);

        LocalDateTime minusFiveMinutes = now.minusMinutes(5);
        System.out.println("DateTime minus 5 minutes: " + minusFiveMinutes);
    }
}
