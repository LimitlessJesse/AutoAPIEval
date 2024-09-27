import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_14 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setPatternSeparator('-');
        System.out.println(symbols.getPatternSeparator());
    }
}
