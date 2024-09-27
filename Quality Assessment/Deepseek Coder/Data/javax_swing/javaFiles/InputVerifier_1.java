import javax.swing.*;
import java.awt.*;

public class InputVerifier_1 {
    public static void main(String[] args) {
        JTextField textField = new JTextField(10);
        textField.setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                String text = ((JTextField)input).getText();
                return text.matches("[0-9]+"); // Verify if the text is a number
            }
        });

        JOptionPane.showMessageDialog(null, textField, "Input Verification", JOptionPane.PLAIN_MESSAGE);
    }
}
