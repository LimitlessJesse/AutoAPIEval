import java.util.Currency;

public class Currency_1 {
    public static void main(String[] args) {
        Currency currency = Currency.getInstance("USD");
        System.out.println("Currency code: " + currency.getCurrencyCode());
        System.out.println("Currency symbol: " + currency.getSymbol());
    }
}
