import javax.swing.text.DefaultFormatter;
import javax.swing.text.JFormattedTextField;
import java.text.ParseException;

public class DefaultFormatter_1 {
    public static void main(String[] args) {
        DefaultFormatter formatter = new DefaultFormatter();
        String text = "123";
        try {
            Object value = formatter.stringToValue(text);
            System.out.println("Converted value: " + value);
        } catch (ParseException e) {
            System.out.println("Error converting string to value: " + e.getMessage());
        }
    }
}
