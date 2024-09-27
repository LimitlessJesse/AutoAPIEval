import java.sql.Time;

public class Time_3 {
    public static void main(String[] args) {
        String timeStr = "13:24:56";
        Time time = Time.valueOf(timeStr);
        System.out.println("Parsed time: " + time);
    }
}
