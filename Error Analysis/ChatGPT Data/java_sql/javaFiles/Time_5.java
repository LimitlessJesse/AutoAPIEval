import java.sql.Time;

public class Time_5 {
    public static void main(String[] args) {
        Time time = new Time(0);
        time.setTime(5000);
        System.out.println("Time after setting: " + time);
    }
}
