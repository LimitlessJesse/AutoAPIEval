import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_1 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        char decimalSeparator = symbols.getDecimalSeparator();
        System.out.println("Decimal Separator: " + decimalSeparator);
    }
}
