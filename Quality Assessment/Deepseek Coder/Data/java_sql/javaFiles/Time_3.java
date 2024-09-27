import java.sql.Time;
import java.sql.Timestamp;

public class Time_3 {
    public static void main(String[] args) {
        Time time = new Time(0);
        System.out.println("Initial time: " + time.toString());

        time.setTime(123456789);
        System.out.println("Updated time: " + time.toString());
    }
}
