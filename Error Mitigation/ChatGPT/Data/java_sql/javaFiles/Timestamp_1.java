import java.sql.Timestamp;

public class Timestamp_1 {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        long time = timestamp.getTime();
        System.out.println("Number of milliseconds since January 1, 1970: " + time);
    }
}
