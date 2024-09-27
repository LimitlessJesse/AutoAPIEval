import java.sql.Timestamp;

public class Timestamp_1 {
    public static void main(String[] args) {
        String datetime = "2021-10-15 15:30:00";
        Timestamp timestamp = Timestamp.valueOf(datetime);
        System.out.println(timestamp);
    }
}
