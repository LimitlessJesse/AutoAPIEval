import java.sql.Timestamp;

public class Timestamp_8 {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Current Timestamp: " + timestamp);

        long time = 1609459200000L; // 2021-01-01 00:00:00
        timestamp.setTime(time);
        System.out.println("Set Timestamp: " + timestamp);
    }
}
