import java.sql.Time;
import java.util.Date;

public class Time_11 {
    public static void main(String[] args) {
        Time time = new Time(new Date().getTime());
        System.out.println("Current Time: " + time);

        long millis = System.currentTimeMillis();
        time.setTime(millis);
        System.out.println("Set Time: " + time);
    }
}
