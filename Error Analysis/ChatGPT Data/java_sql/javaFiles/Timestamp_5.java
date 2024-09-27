import java.sql.Timestamp;

public class Timestamp_5 {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Initial Timestamp: " + timestamp);

        // Setting nanos to 500 million
        setNanos(timestamp, 500000000);

        System.out.println("Updated Timestamp with nanos set to 500 million: " + timestamp);
    }

    public static void setNanos(Timestamp timestamp, int n) {
        timestamp.setNanos(n);
    }
}
