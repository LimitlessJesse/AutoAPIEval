import java.text.DecimalFormatSymbols;
import java.text.spi.DecimalFormatSymbolsProvider;
import java.util.Locale;

public class DecimalFormatSymbolsProvider_1 {
    public static void main(String[] args) {
        DecimalFormatSymbolsProvider provider = new DecimalFormatSymbolsProvider() {
            @Override
            public DecimalFormatSymbols getInstance(Locale locale) {
                return new DecimalFormatSymbols(locale);
            }
        };
        
        Locale locale = new Locale("en", "US");
        DecimalFormatSymbols symbols = provider.getInstance(locale);
        
        System.out.println("Decimal separator: " + symbols.getDecimalSeparator());
        System.out.println("Grouping separator: " + symbols.getGroupingSeparator());
    }
}
