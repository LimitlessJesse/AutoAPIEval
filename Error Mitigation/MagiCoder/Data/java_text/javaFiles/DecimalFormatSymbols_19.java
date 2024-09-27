import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_19 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        char monetaryDecimalSeparator = symbols.getMonetaryDecimalSeparator();
        System.out.println("Monetary Decimal Separator: " + monetaryDecimalSeparator);
    }
}
