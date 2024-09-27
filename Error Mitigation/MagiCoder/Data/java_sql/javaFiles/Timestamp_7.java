import java.sql.Timestamp;
import java.util.Date;

public class Timestamp_7 {
    public static void main(String[] args) {
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        System.out.println(timestamp.toString());
    }
}
