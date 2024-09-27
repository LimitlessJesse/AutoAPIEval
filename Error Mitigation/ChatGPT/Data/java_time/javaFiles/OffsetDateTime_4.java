import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTime_4 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2007-12-03T10:15:30+01:00");
        ZoneOffset newOffset = ZoneOffset.ofHours(3);
        
        OffsetDateTime newDateTime = dateTime.withOffsetSameInstant(newOffset);
        
        System.out.println("Original DateTime: " + dateTime);
        System.out.println("New DateTime with Offset Same Instant: " + newDateTime);
    }
}
