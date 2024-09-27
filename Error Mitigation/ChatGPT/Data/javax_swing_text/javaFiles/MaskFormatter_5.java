import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class MaskFormatter_5 {
    public static void main(String[] args) {
        MaskFormatter formatter = new MaskFormatter();
        try {
            Object value = "123456";
            String formattedValue = formatter.valueToString(value);
            System.out.println("Formatted value: " + formattedValue);
        } catch (ParseException e) {
            System.out.println("Error in conversion: " + e.getMessage());
        }
    }
}
