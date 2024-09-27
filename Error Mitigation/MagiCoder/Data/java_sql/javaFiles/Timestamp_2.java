import java.sql.Timestamp;
import java.util.Date;

public class Timestamp_2 {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(new Date().getTime());
        long time = timestamp.getTime();
        System.out.println(time);
    }
}
