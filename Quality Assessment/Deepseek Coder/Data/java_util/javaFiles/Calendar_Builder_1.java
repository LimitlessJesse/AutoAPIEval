import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendar_Builder_1 {
    public static void main(String[] args) {
        Calendar.Builder builder = new GregorianCalendar().getCalendarBuilder();
        builder.set(Calendar.YEAR, 2022);
        builder.set(Calendar.MONTH, Calendar.JULY);
        builder.set(Calendar.DAY_OF_MONTH, 4);
        Calendar calendar = builder.getCalendar();
        System.out.println(calendar.getTime());
    }
}
