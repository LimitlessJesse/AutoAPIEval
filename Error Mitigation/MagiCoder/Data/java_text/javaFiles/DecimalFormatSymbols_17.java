import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_17 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        String currencySymbol = symbols.getCurrencySymbol();
        System.out.println("Currency Symbol: " + currencySymbol);
    }
}
