import java.util.Currency;

public class Currency_2 {
    public static void main(String[] args) {
        Currency currency = Currency.getInstance("USD");
        int fractionDigits = currency.getDefaultFractionDigits();
        System.out.println("Default fraction digits for USD: " + fractionDigits);
    }
}
