import java.time.OffsetDateTime;

public class OffsetDateTime_5 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now();
        OffsetDateTime newDateTime = dateTime.plusHours(3);
        System.out.println("Original DateTime: " + dateTime);
        System.out.println("DateTime after adding 3 hours: " + newDateTime);
    }
}
