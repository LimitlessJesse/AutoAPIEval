import java.util.Currency;

public class Currency_5 {
    public static void main(String[] args) {
        Currency currency = Currency.getInstance("USD");
        String symbol = currency.getSymbol();
        System.out.println("Symbol for USD currency: " + symbol);
    }
}
