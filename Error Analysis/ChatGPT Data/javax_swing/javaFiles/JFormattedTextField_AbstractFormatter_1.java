import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.DefaultFormatter;
import javax.swing.JFormattedTextField.AbstractFormatter;

public class JFormattedTextField_AbstractFormatter_1 {
    public static void main(String[] args) {
        JFormattedTextField.AbstractFormatter formatter = new JFormattedTextField.AbstractFormatter() {
            @Override
            public Object stringToValue(String text) throws java.text.ParseException {
                return text;
            }

            @Override
            public String valueToString(Object value) throws java.text.ParseException {
                return value.toString();
            }
        };

        JFormattedTextField textField = new JFormattedTextField();
        textField.setFormatterFactory(new DefaultFormatterFactory(new DefaultFormatter()));
        
        try {
            Object value = formatter.stringToValue("Hello");
            System.out.println(value);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
    }
}
