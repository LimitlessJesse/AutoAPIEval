import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

public class Time_12 {
    public static void main(String[] args) {
        Time time = new Time(new Date().getTime());
        System.out.println(time.toString());
    }
}
