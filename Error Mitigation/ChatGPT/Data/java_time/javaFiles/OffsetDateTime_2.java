import java.time.OffsetDateTime;

public class OffsetDateTime_2 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2007-12-03T10:15:30+01:00");
        OffsetDateTime newDateTime = dateTime.minusHours(2);
        System.out.println("Original DateTime: " + dateTime);
        System.out.println("DateTime after subtracting 2 hours: " + newDateTime);
    }
}
