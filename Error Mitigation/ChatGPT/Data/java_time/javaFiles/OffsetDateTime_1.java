import java.time.OffsetDateTime;

public class OffsetDateTime_1 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2007-12-03T10:15:30+01:00");
        OffsetDateTime newDateTime = dateTime.plusDays(5);
        System.out.println("Original DateTime: " + dateTime);
        System.out.println("DateTime after adding 5 days: " + newDateTime);
    }
}
