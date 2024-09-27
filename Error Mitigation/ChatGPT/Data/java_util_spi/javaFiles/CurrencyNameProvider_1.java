import java.util.Currency;
import java.util.Locale;
import java.util.spi.CurrencyNameProvider;

public class CurrencyNameProvider_1 {
    public static void main(String[] args) {
        CurrencyNameProvider provider = CurrencyNameProvider.getInstance();
        String currencyCode = "USD";
        Locale locale = Locale.US;
        String symbol = provider.getSymbol(currencyCode, locale);
        System.out.println("Symbol for " + currencyCode + " in " + locale + " is: " + symbol);
    }
}
