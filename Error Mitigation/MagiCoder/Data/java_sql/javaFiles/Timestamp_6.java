import java.sql.Timestamp;

public class Timestamp_6 {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        int hashCode = timestamp.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
