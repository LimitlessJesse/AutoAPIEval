import java.time.OffsetTime;

public class OffsetTime_3 {
    public static void main(String[] args) {
        OffsetTime offsetTime = OffsetTime.parse("10:15:30+01:00");
        System.out.println("Original OffsetTime: " + offsetTime);

        OffsetTime updatedOffsetTime = offsetTime.withSecond(45);
        System.out.println("Updated OffsetTime with second set to 45: " + updatedOffsetTime);
    }
}
