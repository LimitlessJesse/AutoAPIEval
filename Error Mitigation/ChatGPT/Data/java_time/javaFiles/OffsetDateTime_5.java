import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;

public class OffsetDateTime_5 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2007-12-03T10:15:30+01:00");
        OffsetDateTime truncatedDateTime = dateTime.truncatedTo(ChronoUnit.MINUTES);
        System.out.println("Original DateTime: " + dateTime);
        System.out.println("Truncated DateTime: " + truncatedDateTime);
    }
}
