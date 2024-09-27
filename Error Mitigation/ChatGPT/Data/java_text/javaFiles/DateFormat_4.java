import java.text.DateFormat;
import java.util.TimeZone;

public class DateFormat_4 {
    public static void main(String[] args) {
        DateFormat dateFormat = DateFormat.getInstance();
        TimeZone timeZone = TimeZone.getTimeZone("GMT+2");
        dateFormat.setTimeZone(timeZone);
        System.out.println("Time zone set to: " + dateFormat.getTimeZone().getID());
    }
}
