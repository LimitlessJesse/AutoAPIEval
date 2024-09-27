import java.time.LocalDateTime;

public class LocalDateTime_30 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Original LocalDateTime: " + dateTime);

        LocalDateTime newDateTime = dateTime.minusNanos(1000);
        System.out.println("LocalDateTime after subtracting 1000 nanoseconds: " + newDateTime);
    }
}
