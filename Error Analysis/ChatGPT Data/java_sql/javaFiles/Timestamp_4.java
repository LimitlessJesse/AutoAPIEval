import java.sql.Timestamp;

public class Timestamp_4 {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String timestampString = timestamp.toString();
        System.out.println("Timestamp to String: " + timestampString);
    }
}
