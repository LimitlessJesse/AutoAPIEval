import java.sql.Timestamp;

public class Timestamp_4 {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Before setting nanos: " + timestamp.getNanos());
        
        timestamp.setNanos(500000000);
        System.out.println("After setting nanos: " + timestamp.getNanos());
    }
}
