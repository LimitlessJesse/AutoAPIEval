import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_16 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setCurrencySymbol("$");
        System.out.println(symbols.getCurrencySymbol());
    }
}
