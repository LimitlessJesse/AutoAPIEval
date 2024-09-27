import java.text.DateFormat;
import java.text.spi.DateFormatProvider;
import java.util.Locale;

public class DateFormatProvider_4 {
    public static void main(String[] args) {
        DateFormatProvider provider = new DateFormatProvider() {
            @Override
            public DateFormat getDateTimeInstance(int dateStyle, int timeStyle, Locale locale) {
                return DateFormat.getDateTimeInstance(dateStyle, timeStyle, locale);
            }
        };

        DateFormat dateFormat = provider.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT, Locale.US);
        System.out.println(dateFormat.format(System.currentTimeMillis()));
    }
}
