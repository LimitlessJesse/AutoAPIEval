import java.util.Currency;

public class Currency_3 {
    public static void main(String[] args) {
        Currency currency = Currency.getInstance("USD");
        String displayName = currency.getDisplayName();
        System.out.println(displayName);
    }
}
