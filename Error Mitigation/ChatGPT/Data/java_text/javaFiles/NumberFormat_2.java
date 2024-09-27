import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat_2 {
    public static void main(String[] args) {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        double amount = 1234.56;
        String formattedAmount = currencyFormat.format(amount);
        System.out.println("Formatted amount: " + formattedAmount);
    }
}
