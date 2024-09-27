import java.text.DateFormat;
import java.util.TimeZone;

public class DateFormat_5 {
    public static void main(String[] args) {
        DateFormat dateFormat = DateFormat.getDateTimeInstance();
        TimeZone timeZone = TimeZone.getTimeZone("GMT+2");
        dateFormat.setTimeZone(timeZone);
        System.out.println("Formatted date with timezone: " + dateFormat.format(System.currentTimeMillis()));
    }
}
