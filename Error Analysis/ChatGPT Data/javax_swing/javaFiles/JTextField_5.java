import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextField_5 {
    public static void main(String[] args) {
        JTextField textField = new JTextField();
        
        // Adding ActionListener to the JTextField
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Text entered: " + textField.getText());
            }
        });
        
        // Creating a JFrame to display the JTextField
        JFrame frame = new JFrame("JTextField Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(textField);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
