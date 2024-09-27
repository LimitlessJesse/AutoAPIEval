import java.util.SimpleTimeZone;

public class SimpleTimeZone_4 {
    public static void main(String[] args) {
        SimpleTimeZone timeZone = new SimpleTimeZone(0, "GMT");
        boolean usesDaylightTime = timeZone.useDaylightTime();
        System.out.println("Uses Daylight Time: " + usesDaylightTime);
    }
}
