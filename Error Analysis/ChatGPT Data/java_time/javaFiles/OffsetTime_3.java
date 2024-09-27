import java.time.OffsetTime;

public class OffsetTime_3 {
    public static void main(String[] args) {
        OffsetTime offsetTime = OffsetTime.now();
        System.out.println("OffsetTime before: " + offsetTime);

        OffsetTime minusHoursOffsetTime = offsetTime.minusHours(2);
        System.out.println("OffsetTime after minus 2 hours: " + minusHoursOffsetTime);
    }
}
