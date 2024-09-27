import java.sql.Timestamp;

public class Timestamp_3 {
    public static void main(String[] args) {
        Timestamp ts1 = Timestamp.valueOf("2022-01-01 00:00:00");
        Timestamp ts2 = Timestamp.valueOf("2023-01-01 00:00:00");

        int comparison = ts1.compareTo(ts2);

        if (comparison < 0) {
            System.out.println(ts1 + " is before " + ts2);
        } else if (comparison > 0) {
            System.out.println(ts1 + " is after " + ts2);
        } else {
            System.out.println(ts1 + " is equal to " + ts2);
        }
    }
}
