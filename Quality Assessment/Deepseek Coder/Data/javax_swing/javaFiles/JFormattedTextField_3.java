import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import java.text.DecimalFormat;

public class JFormattedTextField_3 {
    public static void main(String[] args) {
        JFormattedTextField jftf = new JFormattedTextField();

        // Create a formatter
        DecimalFormat decimalFormat = new DecimalFormat("#");
        NumberFormatter numberFormatter = new NumberFormatter(decimalFormat);
        DefaultFormatterFactory formatterFactory = new DefaultFormatterFactory(numberFormatter);

        // Set the formatter to the JFormattedTextField
        jftf.setFormatterFactory(formatterFactory);

        // Set a value to the JFormattedTextField
        jftf.setValue(123);

        // Print the value
        System.out.println(jftf.getValue());
    }
}
