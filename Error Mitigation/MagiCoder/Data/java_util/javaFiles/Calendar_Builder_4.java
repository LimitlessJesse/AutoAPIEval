import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendar_Builder_4 {
    public static void main(String[] args) {
        Calendar.Builder builder = new GregorianCalendar.Builder();
        builder.setWeekDate(2022, 1, Calendar.SUNDAY);
        Calendar calendar = builder.build();
        System.out.println(calendar.getTime());
    }
}
