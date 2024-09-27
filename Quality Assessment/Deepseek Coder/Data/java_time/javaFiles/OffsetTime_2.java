import java.time.OffsetTime;
import java.time.ZoneOffset;

public class OffsetTime_2 {
    public static void main(String[] args) {
        OffsetTime time = OffsetTime.now(ZoneOffset.UTC);
        System.out.println("Original time: " + time);

        OffsetTime newTime = time.plusHours(2);
        System.out.println("New time after adding 2 hours: " + newTime);
    }
}
