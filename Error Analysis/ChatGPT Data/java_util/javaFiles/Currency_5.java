import java.util.Currency;

public class Currency_5 {
    public static void main(String[] args) {
        Currency currency = Currency.getInstance("USD");
        System.out.println("Currency symbol: " + currency.getSymbol());
    }
}
