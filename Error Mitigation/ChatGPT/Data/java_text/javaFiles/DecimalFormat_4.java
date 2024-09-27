import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class DecimalFormat_4 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        String text = "123.45";
        ParsePosition pos = new ParsePosition(0);
        
        Number parsedNumber = decimalFormat.parse(text, pos);
        
        if (parsedNumber != null) {
            System.out.println("Parsed Number: " + parsedNumber);
            System.out.println("Index after parsing: " + pos.getIndex());
        } else {
            System.out.println("Parsing failed. Error index: " + pos.getErrorIndex());
        }
    }
}
