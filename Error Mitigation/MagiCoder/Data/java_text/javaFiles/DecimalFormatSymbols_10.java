import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_10 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDigit('*');
        System.out.println(symbols.getDigit());
    }
}
