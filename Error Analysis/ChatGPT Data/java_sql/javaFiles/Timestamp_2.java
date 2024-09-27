import java.sql.Timestamp;

public class Timestamp_2 {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        long timeInMillis = timestamp.getTime();
        System.out.println("Time in milliseconds: " + timeInMillis);
    }
}
