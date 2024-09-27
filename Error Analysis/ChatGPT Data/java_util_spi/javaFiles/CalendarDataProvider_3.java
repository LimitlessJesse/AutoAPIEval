import java.util.Locale;
import java.util.spi.CalendarDataProvider;

public class CalendarDataProvider_3 {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        CalendarDataProvider calendarDataProvider = CalendarDataProvider.getInstance(locale);
        int firstDayOfWeek = calendarDataProvider.getFirstDayOfWeek(locale);
        System.out.println("First day of the week: " + firstDayOfWeek);
    }
}
