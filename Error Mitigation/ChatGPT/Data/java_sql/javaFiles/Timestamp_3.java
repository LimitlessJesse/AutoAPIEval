import java.sql.Timestamp;

public class Timestamp_3 {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        int nanos = timestamp.getNanos();
        System.out.println("Nanos value: " + nanos);
    }
}
