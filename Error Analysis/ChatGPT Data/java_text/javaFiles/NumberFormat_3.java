import java.text.NumberFormat;
import java.text.ParseException;

public class NumberFormat_3 {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        try {
            Number number = nf.parse("42");
            System.out.println("Parsed number: " + number);
        } catch (ParseException e) {
            System.out.println("Error parsing number: " + e.getMessage());
        }
    }
}
