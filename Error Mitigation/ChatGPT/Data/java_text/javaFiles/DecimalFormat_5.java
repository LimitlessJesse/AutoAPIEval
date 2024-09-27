import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class DecimalFormat_5 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        
        df.setDecimalFormatSymbols(symbols);
        
        double number = 12345.67;
        String formattedNumber = df.format(number);
        
        System.out.println("Formatted Number: " + formattedNumber);
    }
}
