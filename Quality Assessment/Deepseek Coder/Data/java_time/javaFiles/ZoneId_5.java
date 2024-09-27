import java.time.ZoneId;

public class ZoneId_5 {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        String id = zoneId.getId();
        System.out.println("Id of the ZoneId: " + id);
    }
}
