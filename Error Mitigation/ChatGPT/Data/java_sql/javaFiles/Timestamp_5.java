import java.sql.Timestamp;

public class Timestamp_5 {
    public static void main(String[] args) {
        String timestampString = "2022-01-01 12:00:00";
        Timestamp timestamp = Timestamp.valueOf(timestampString);
        System.out.println("Timestamp value: " + timestamp);
    }
}
