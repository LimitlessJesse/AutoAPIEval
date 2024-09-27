import java.time.ZoneId;

public class ZoneId_5 {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        String id = zoneId.getId();
        System.out.println("Time-zone ID: " + id);
    }
}
