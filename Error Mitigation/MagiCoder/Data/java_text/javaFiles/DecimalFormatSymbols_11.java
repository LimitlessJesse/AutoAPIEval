import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_11 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        char digit = symbols.getDigit();
        System.out.println("The character used for a digit in a pattern is: " + digit);
    }
}
