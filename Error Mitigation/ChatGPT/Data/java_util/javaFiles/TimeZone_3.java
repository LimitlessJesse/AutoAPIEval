import java.util.TimeZone;

public class TimeZone_3 {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getDefault();
        String id = timeZone.getID();
        System.out.println("Time zone ID: " + id);
    }
}
