import java.text.NumberFormat;
import java.text.spi.NumberFormatProvider;
import java.util.Locale;

public class NumberFormatProvider_3 {
    public static void main(String[] args) {
        NumberFormatProvider provider = NumberFormatProvider.getInstance();
        NumberFormat numberFormat = provider.getNumberInstance(Locale.US);
        double number = 12345.67;
        String formattedNumber = numberFormat.format(number);
        System.out.println(formattedNumber);
    }
}
