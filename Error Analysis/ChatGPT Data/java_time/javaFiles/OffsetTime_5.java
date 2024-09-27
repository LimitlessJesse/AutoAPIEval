import java.time.LocalTime;
import java.time.OffsetTime;

public class OffsetTime_5 {
    public static void main(String[] args) {
        OffsetTime offsetTime = OffsetTime.of(10, 30, 0, 0, ZoneOffset.UTC);
        LocalTime localTime = offsetTime.toLocalTime();
        System.out.println("OffsetTime: " + offsetTime);
        System.out.println("LocalTime: " + localTime);
    }
}
