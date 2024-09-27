import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_20 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setExponentSeparator("E");
        System.out.println(symbols.getExponentSeparator());
    }
}
