import java.time.ZoneOffset;

public class ZoneOffset_1 {
    public static void main(String[] args) {
        ZoneOffset zone1 = ZoneOffset.UTC;
        ZoneOffset zone2 = ZoneOffset.ofHours(2);

        boolean isEqual = zone1.equals(zone2);
        System.out.println("Zone1 equals Zone2: " + isEqual);
    }
}
