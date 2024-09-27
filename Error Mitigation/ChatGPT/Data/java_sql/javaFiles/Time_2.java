import java.sql.Time;

public class Time_2 {
    public static void main(String[] args) {
        Time time = new Time(System.currentTimeMillis());
        System.out.println(time.toString());
    }
}
