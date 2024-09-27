import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat_2 {
    public static void main(String[] args) {
        double number = 12345.67;
        
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        String formattedNumber = numberFormat.format(number);
        
        System.out.println(formattedNumber);
    }
}
