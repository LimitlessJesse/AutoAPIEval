import java.time.OffsetTime;

public class OffsetTime_4 {
    public static void main(String[] args) {
        OffsetTime time1 = OffsetTime.of(10, 30, 0, 0, ZoneOffset.UTC);
        OffsetTime time2 = OffsetTime.of(12, 0, 0, 0, ZoneOffset.UTC);
        
        boolean isAfter = time1.isAfter(time2);
        System.out.println("Is time1 after time2? " + isAfter);
    }
}
