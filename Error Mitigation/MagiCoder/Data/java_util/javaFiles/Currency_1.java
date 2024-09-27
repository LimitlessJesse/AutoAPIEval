import java.util.Currency;

public class Currency_1 {
    public static void main(String[] args) {
        try {
            Currency currency = Currency.getInstance("USD");
            System.out.println(currency.getCurrencyCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
