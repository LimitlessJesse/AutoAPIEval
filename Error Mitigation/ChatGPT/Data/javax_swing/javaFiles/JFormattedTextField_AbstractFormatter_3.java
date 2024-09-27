import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;

public class JFormattedTextField_AbstractFormatter_3 {
    public static void main(String[] args) {
        JFormattedTextField ftf = new JFormattedTextField();
        AbstractFormatter formatter = ftf.getFormatter();
        if (formatter != null) {
            formatter.install(ftf);
        }
    }
}
