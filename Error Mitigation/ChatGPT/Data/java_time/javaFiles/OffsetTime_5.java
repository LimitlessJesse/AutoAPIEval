import java.time.OffsetTime;
import java.time.temporal.ChronoUnit;

public class OffsetTime_5 {
    public static void main(String[] args) {
        OffsetTime offsetTime = OffsetTime.parse("10:15:30+01:00");
        OffsetTime truncatedTime = offsetTime.truncatedTo(ChronoUnit.MINUTES);
        System.out.println("Original OffsetTime: " + offsetTime);
        System.out.println("Truncated OffsetTime: " + truncatedTime);
    }
}
