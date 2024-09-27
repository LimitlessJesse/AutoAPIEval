import java.text.DateFormat;
import java.util.TimeZone;

public class DateFormat_4 {
    public static void main(String[] args) {
        DateFormat df = DateFormat.getDateTimeInstance();
        TimeZone tz = df.getTimeZone();
        System.out.println(tz.getID());
    }
}
