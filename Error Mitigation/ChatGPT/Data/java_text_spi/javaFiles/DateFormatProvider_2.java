import java.text.DateFormat;
import java.text.spi.DateFormatProvider;
import java.util.Locale;

public class DateFormatProvider_2 {
    public static void main(String[] args) {
        DateFormatProvider provider = DateFormatProvider.getInstance();
        DateFormat dateFormat = provider.getDateInstance(DateFormat.MEDIUM, Locale.US);
        System.out.println(dateFormat.format(new Date()));
    }
}
