import java.sql.Time;

public class Time_5 {
    public static void main(String[] args) {
        String timeString = "12:30:45";
        Time time = Time.valueOf(timeString);
        System.out.println("Time object: " + time);
    }
}
