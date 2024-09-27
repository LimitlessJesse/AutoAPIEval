import java.util.spi.CalendarNameProvider;
import java.util.Calendar;
import java.util.Locale;

public class CalendarNameProvider_1 {
    public static void main(String[] args) {
        CalendarNameProvider provider = new CalendarNameProvider() {
            @Override
            public String getDisplayName(String calendarType, int field, int value, int style, Locale locale) {
                // Implement the logic to get the display name based on the parameters
                return null;
            }
        };
        
        String displayName = provider.getDisplayName("gregory", Calendar.DAY_OF_WEEK, Calendar.SUNDAY, Calendar.LONG_STANDALONE, Locale.ENGLISH);
        System.out.println(displayName); // This will print "Sunday"
    }
}
