import java.sql.Timestamp;

public class Timestamp_3 {
    public static void main(String[] args) {
        Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
        Timestamp timestamp2 = new Timestamp(System.currentTimeMillis() + 1000);

        int result = timestamp1.compareTo(timestamp2);

        if (result < 0) {
            System.out.println("timestamp1 is before timestamp2");
        } else if (result == 0) {
            System.out.println("timestamp1 is equal to timestamp2");
        } else {
            System.out.println("timestamp1 is after timestamp2");
        }
    }
}
