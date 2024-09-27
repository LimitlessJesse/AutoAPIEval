import java.time.OffsetTime;
import java.time.ZoneOffset;

public class OffsetTime_3 {
    public static void main(String[] args) {
        // Create an OffsetTime
        OffsetTime time = OffsetTime.of(10, 30, 0, 0, ZoneOffset.ofHours(2));
        System.out.println("Original OffsetTime: " + time);

        // Subtract 5 hours
        OffsetTime newTime = time.minusHours(5);
        System.out.println("OffsetTime after subtracting 5 hours: " + newTime);
    }
}
