import java.util.Currency;
import java.util.Locale;

public class Currency_4 {
    public static void main(String[] args) {
        Currency usd = Currency.getInstance(Locale.US);
        System.out.println(usd.getSymbol());
    }
}
