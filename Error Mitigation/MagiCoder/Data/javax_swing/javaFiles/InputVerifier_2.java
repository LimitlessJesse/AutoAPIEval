import javax.swing.*;
import java.awt.*;

public class InputVerifier_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("InputVerifier Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextField textField = new JTextField(10);
        textField.setInputVerifier(new InputVerifier() {
            @Override
            public boolean shouldYieldFocus(JComponent input) {
                JTextField textField = (JTextField) input;
                String text = textField.getText();
                if (text.isEmpty()) {
                    textField.setBackground(Color.RED);
                    return false;
                } else {
                    textField.setBackground(Color.WHITE);
                    return true;
                }
            }
        });

        frame.add(textField);
        frame.setVisible(true);
    }
}
