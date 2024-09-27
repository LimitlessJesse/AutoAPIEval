import javax.swing.JFormattedTextField;
import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;

public class JFormattedTextField_2 {
    public static void main(String[] args) {
        JFormattedTextField formattedTextField = new JFormattedTextField(new NumberFormatter(NumberFormat.getIntegerInstance()));
        formattedTextField.setValue(10);
        System.out.println(formattedTextField.getValue());
    }
}
