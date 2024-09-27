import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatter;

public class DefaultFormatter_3 {
    public static void main(String[] args) {
        JFormattedTextField textField = new JFormattedTextField();
        DefaultFormatter formatter = new DefaultFormatter();
        formatter.install(textField);
    }
}
