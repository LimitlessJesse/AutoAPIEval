import java.sql.Timestamp;

public class Timestamp_4 {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp.toString());
    }
}
