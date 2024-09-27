import java.util.Currency;
import java.util.Locale;
import java.util.spi.CurrencyNameProvider;

public class CurrencyNameProvider_2 {
    public static void main(String[] args) {
        CurrencyNameProvider provider = CurrencyNameProvider.getInstance();
        String currencyCode = "USD";
        Locale locale = Locale.US;
        
        String displayName = provider.getDisplayName(currencyCode, locale);
        System.out.println("Display Name for " + currencyCode + " in " + locale + ": " + displayName);
    }
}
