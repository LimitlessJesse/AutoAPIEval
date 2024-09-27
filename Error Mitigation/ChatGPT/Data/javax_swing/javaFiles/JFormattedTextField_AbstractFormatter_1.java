import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

import java.text.ParseException;

public class JFormattedTextField_AbstractFormatter_1 {
    public static void main(String[] args) {
        JFormattedTextField.AbstractFormatter formatter = new NumberFormatter();
        try {
            Object value = formatter.stringToValue("123");
            System.out.println(value);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
