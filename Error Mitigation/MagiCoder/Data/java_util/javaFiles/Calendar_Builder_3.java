import java.util.Calendar;
import java.util.TimeZone;

public class Calendar_Builder_3 {
    public static void main(String[] args) {
        Calendar.Builder builder = new Calendar.Builder();
        TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
        builder.setTimeZone(timeZone);
        Calendar calendar = builder.build();
        System.out.println(calendar.getTimeZone());
    }
}
