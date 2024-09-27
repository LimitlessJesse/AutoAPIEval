import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_9 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        char zeroDigit = symbols.getZeroDigit();
        System.out.println("Zero digit: " + zeroDigit);
    }
}
