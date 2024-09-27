import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTime_9 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now(ZoneOffset.UTC);
        System.out.println("Original OffsetDateTime: " + dateTime);

        OffsetDateTime newDateTime = dateTime.plusYears(5);
        System.out.println("OffsetDateTime after adding 5 years: " + newDateTime);
    }
}
