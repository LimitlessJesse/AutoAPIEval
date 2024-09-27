import java.sql.Timestamp;

public class Timestamp_3 {
    public static void main(String[] args) {
        Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
        Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

        int comparisonValue = timestamp1.compareTo(timestamp2);

        if (comparisonValue == 0) {
            System.out.println("Both timestamps are equal");
        } else if (comparisonValue > 0) {
            System.out.println("The first timestamp is later than the second one");
        } else {
            System.out.println("The first timestamp is earlier than the second one");
        }
    }
}
