import java.time.OffsetDateTime;

public class OffsetDateTime_3 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2007-12-03T10:15:30+01:00");
        OffsetDateTime newDateTime = dateTime.withYear(2022);
        System.out.println("Original DateTime: " + dateTime);
        System.out.println("Modified DateTime with Year 2022: " + newDateTime);
    }
}
