import java.time.LocalDateTime;

public class LocalDateTime_5 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.parse("2007-12-03T10:15:30");
        LocalDateTime newDateTime = dateTime.minusHours(2);
        
        System.out.println("Original DateTime: " + dateTime);
        System.out.println("DateTime after subtracting 2 hours: " + newDateTime);
    }
}
