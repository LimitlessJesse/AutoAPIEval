import java.time.LocalDateTime;

public class LocalDateTime_26 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Original date and time: " + dateTime);

        LocalDateTime newDateTime = dateTime.minusYears(2);
        System.out.println("Date and time after subtracting 2 years: " + newDateTime);
    }
}
