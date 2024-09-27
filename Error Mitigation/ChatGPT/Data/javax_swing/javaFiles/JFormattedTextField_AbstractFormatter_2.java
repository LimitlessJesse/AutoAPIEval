import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import java.text.ParseException;

public class JFormattedTextField_AbstractFormatter_2 {
    public static void main(String[] args) {
        JFormattedTextField.AbstractFormatter formatter = new NumberFormatter();
        try {
            String stringValue = formatter.valueToString(10);
            System.out.println("String value: " + stringValue);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
