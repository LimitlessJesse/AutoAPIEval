import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat_3 {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        double number = 12345.67;
        String formattedNumber = numberFormat.format(number);
        System.out.println("Formatted Number: " + formattedNumber);
    }
}
