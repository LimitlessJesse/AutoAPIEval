import java.time.OffsetTime;
import java.time.ZoneOffset;

public class OffsetTime_4 {
    public static void main(String[] args) {
        OffsetTime offsetTime = OffsetTime.parse("10:30:00+02:00");
        ZoneOffset newOffset = ZoneOffset.ofHours(3);
        
        OffsetTime newOffsetTime = offsetTime.withOffsetSameLocal(newOffset);
        
        System.out.println("Original OffsetTime: " + offsetTime);
        System.out.println("OffsetTime with new offset: " + newOffsetTime);
    }
}
