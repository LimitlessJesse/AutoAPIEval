import java.time.ZoneOffset;

public class ZoneOffset_4 {
    public static void main(String[] args) {
        ZoneOffset zoneOffset = ZoneOffset.ofHours(2);
        String id = zoneOffset.getId();
        System.out.println("Zone offset ID: " + id);
    }
}
