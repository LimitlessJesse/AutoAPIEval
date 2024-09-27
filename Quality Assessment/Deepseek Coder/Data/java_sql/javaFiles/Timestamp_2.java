import java.sql.Timestamp;

public class Timestamp_2 {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Original Timestamp: " + timestamp);

        // Set a new time
        timestamp.setTime(1638499200000L); // 2021-12-01 00:00:00
        System.out.println("New Timestamp: " + timestamp);
    }
}
