import java.time.LocalDateTime;

public class LocalDateTime_33 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Original date-time: " + dateTime);

        LocalDateTime newDateTime = dateTime.minusNanos(500000000);
        System.out.println("Date-time after subtracting nanos: " + newDateTime);
    }
}
