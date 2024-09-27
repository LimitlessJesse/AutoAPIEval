import java.time.OffsetTime;

public class OffsetTime_2 {
    public static void main(String[] args) {
        OffsetTime offsetTime = OffsetTime.now();
        int hour = offsetTime.getHour();
        System.out.println("Current hour: " + hour);
    }
}
