import javax.swing.*;
import java.awt.*;

public class InputVerifier_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Input Verifier Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextField textField = new JTextField(10);
        textField.setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                String text = ((JTextField) input).getText();
                return text.matches("[0-9]+");
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter a number:"));
        panel.add(textField);

        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
