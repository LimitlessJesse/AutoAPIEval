import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_3 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        char decimalSeparator = symbols.getDecimalSeparator();
        System.out.println("The decimal separator is: " + decimalSeparator);
    }
}
