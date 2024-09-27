import java.time.OffsetTime;
import java.time.ZoneOffset;

public class OffsetTime_4 {
    public static void main(String[] args) {
        OffsetTime time = OffsetTime.now(ZoneOffset.UTC);
        System.out.println("Original time: " + time);

        OffsetTime newTime = time.plusMinutes(30);
        System.out.println("New time after adding 30 minutes: " + newTime);
    }
}
