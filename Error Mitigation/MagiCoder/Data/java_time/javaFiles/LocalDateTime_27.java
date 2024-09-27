import java.time.LocalDateTime;

public class LocalDateTime_27 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2007, 3, 31, 10, 15, 30);
        System.out.println("Original date-time: " + dateTime);

        LocalDateTime newDateTime = dateTime.minusMonths(1);
        System.out.println("Date-time after subtracting one month: " + newDateTime);
    }
}
