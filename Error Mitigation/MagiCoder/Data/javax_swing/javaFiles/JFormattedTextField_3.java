import javax.swing.JFormattedTextField;
import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;

public class JFormattedTextField_3 {
    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getInstance();
        NumberFormatter formatter = new NumberFormatter(format);
        JFormattedTextField field = new JFormattedTextField(formatter);

        field.setText("123");
        System.out.println(field.getValue());
    }
}
