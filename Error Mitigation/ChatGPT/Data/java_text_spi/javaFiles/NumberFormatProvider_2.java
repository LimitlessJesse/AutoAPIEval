import java.text.NumberFormat;
import java.text.spi.NumberFormatProvider;
import java.util.Locale;

public class NumberFormatProvider_2 {
    public static void main(String[] args) {
        NumberFormatProvider provider = NumberFormatProvider.getInstance();
        NumberFormat numberFormat = provider.getIntegerInstance(Locale.US);
        System.out.println(numberFormat.format(12345));
    }
}
