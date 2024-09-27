import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class JTextField_5 {
    public static void main(String[] args) {
        JTextField textField = new JTextField();
        textField.addActionListener(e -> {
            System.out.println("Action performed");
        });
    }
}
