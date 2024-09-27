import java.util.Currency;
import java.util.Locale;

public class Currency_3 {
    public static void main(String[] args) {
        Currency usd = Currency.getInstance("USD");
        Locale locale = new Locale("en", "US");
        
        String displayName = usd.getDisplayName(locale);
        System.out.println("Display name for USD in en-US locale: " + displayName);
    }
}
