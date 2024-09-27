import java.time.OffsetTime;

public class OffsetTime_1 {
    public static void main(String[] args) {
        OffsetTime offsetTime = OffsetTime.parse("10:15:30+01:00");
        System.out.println("Original OffsetTime: " + offsetTime);

        OffsetTime newOffsetTime = offsetTime.withHour(15);
        System.out.println("OffsetTime with hour altered: " + newOffsetTime);
    }
}
