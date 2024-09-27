import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_3 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(','); // Set the decimal separator to ','
        System.out.println(symbols.getDecimalSeparator()); // Print the new decimal separator
    }
}
