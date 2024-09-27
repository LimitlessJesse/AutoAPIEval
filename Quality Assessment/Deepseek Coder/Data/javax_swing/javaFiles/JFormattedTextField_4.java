import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JFormattedTextField_4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("JFormattedTextField Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JFormattedTextField formattedTextField = new JFormattedTextField();
                frame.add(formattedTextField);

                frame.pack();
                frame.setVisible(true);

                // Set a value
                formattedTextField.setValue(123.45);

                // Get the value
                Object value = formattedTextField.getValue();
                System.out.println("Value: " + value);
            }
        });
    }
}
