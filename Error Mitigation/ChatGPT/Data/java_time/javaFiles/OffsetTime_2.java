import java.time.OffsetTime;

public class OffsetTime_2 {
    public static void main(String[] args) {
        OffsetTime offsetTime = OffsetTime.parse("10:15:30+01:00");
        OffsetTime newOffsetTime = offsetTime.withMinute(45);
        System.out.println("Original OffsetTime: " + offsetTime);
        System.out.println("OffsetTime with minute set to 45: " + newOffsetTime);
    }
}
