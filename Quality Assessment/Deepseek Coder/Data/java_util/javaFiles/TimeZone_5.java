import java.util.TimeZone;

public class TimeZone_5 {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
        String id = timeZone.getID();
        System.out.println("TimeZone ID: " + id);
    }
}
