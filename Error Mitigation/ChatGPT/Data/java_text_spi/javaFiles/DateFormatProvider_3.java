import java.text.DateFormat;
import java.text.spi.DateFormatProvider;
import java.util.Locale;

public class DateFormatProvider_3 {
    public static void main(String[] args) {
        DateFormatProvider provider = DateFormatProvider.getInstance();
        DateFormat dateFormat = provider.getTimeInstance(DateFormat.DEFAULT, Locale.getDefault());
        System.out.println(dateFormat.format(new Date()));
    }
}
