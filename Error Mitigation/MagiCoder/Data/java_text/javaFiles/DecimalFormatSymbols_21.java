import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_21 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        String exponentSeparator = symbols.getExponentSeparator();
        System.out.println("Exponent Separator: " + exponentSeparator);
    }
}
