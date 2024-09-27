import java.sql.Timestamp;

public class Timestamp_5 {
    public static void main(String[] args) {
        Timestamp ts1 = new Timestamp(System.currentTimeMillis());
        Timestamp ts2 = new Timestamp(System.currentTimeMillis());

        System.out.println(ts1.equals(ts2)); // This will print true if ts1 and ts2 are equal, false otherwise
    }
}
