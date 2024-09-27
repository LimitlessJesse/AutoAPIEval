import javax.swing.text.DefaultFormatter;
import javax.swing.text.JFormattedTextField;
import java.text.ParseException;

public class DefaultFormatter_2 {
    public static void main(String[] args) {
        DefaultFormatter formatter = new DefaultFormatter();
        Object value = 10; // Example value to convert
        try {
            String stringValue = formatter.valueToString(value);
            System.out.println("String representation of value: " + stringValue);
        } catch (ParseException e) {
            System.out.println("Error in conversion: " + e.getMessage());
        }
    }
}
