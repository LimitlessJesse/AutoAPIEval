import java.util.Currency;

public class Currency_4 {
    public static void main(String[] args) {
        Currency currency = Currency.getInstance("USD");
        String symbol = currency.getSymbol();
        System.out.println("The symbol of the currency is: " + symbol);
    }
}
