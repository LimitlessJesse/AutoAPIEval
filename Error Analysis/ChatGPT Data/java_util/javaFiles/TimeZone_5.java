import java.util.TimeZone;

public class TimeZone_5 {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getDefault();
        boolean usesDaylightTime = timeZone.useDaylightTime();
        System.out.println("Uses Daylight Time: " + usesDaylightTime);
    }
}
