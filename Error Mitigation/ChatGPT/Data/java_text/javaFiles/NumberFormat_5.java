import java.text.NumberFormat;
import java.text.ParseException;

public class NumberFormat_5 {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        String numberString = "123.45";
        
        try {
            Number parsedNumber = nf.parse(numberString);
            System.out.println("Parsed number: " + parsedNumber);
        } catch (ParseException e) {
            System.out.println("Error parsing number: " + e.getMessage());
        }
    }
}
