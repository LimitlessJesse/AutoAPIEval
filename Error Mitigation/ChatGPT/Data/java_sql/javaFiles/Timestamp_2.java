import java.sql.Timestamp;

public class Timestamp_2 {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(0);
        System.out.println("Before setTime: " + timestamp);
        
        timestamp.setTime(1000);
        System.out.println("After setTime: " + timestamp);
    }
}
