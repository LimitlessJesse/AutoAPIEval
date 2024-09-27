import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatterFactory;

public class JFormattedTextField_AbstractFormatterFactory_1 {
    public static void main(String[] args) {
        JFormattedTextField tf = new JFormattedTextField();
        AbstractFormatterFactory factory = tf.getFormatterFactory();
        JFormattedTextField.AbstractFormatter formatter = (JFormattedTextField.AbstractFormatter) factory.getFormatter(tf);
    }
}
