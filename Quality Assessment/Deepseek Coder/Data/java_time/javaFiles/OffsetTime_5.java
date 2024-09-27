import java.time.OffsetTime;
import java.time.ZoneOffset;

public class OffsetTime_5 {
    public static void main(String[] args) {
        // Create an OffsetTime
        OffsetTime time = OffsetTime.now(ZoneOffset.UTC);
        System.out.println("Original OffsetTime: " + time);

        // Subtract 30 minutes
        OffsetTime newTime = time.minusMinutes(30);
        System.out.println("New OffsetTime after subtracting 30 minutes: " + newTime);
    }
}
