import javax.swing.text.InternationalFormatter;
import java.text.ParseException;

public class InternationalFormatter_2 {
    public static void main(String[] args) {
        InternationalFormatter formatter = new InternationalFormatter();
        Object value = 123; // Example value
        try {
            String stringValue = formatter.valueToString(value);
            System.out.println("String representation of value: " + stringValue);
        } catch (ParseException e) {
            System.out.println("Error in conversion: " + e.getMessage());
        }
    }
}
