import javax.swing.JOptionPane;
import java.awt.Component;

public class JOptionPane_2 {
    public static void main(String[] args) {
        Component parentComponent = null; // Set parentComponent to null
        Object message = "Hello, this is a message!"; // Set message to display

        try {
            JOptionPane.showMessageDialog(parentComponent, message);
        } catch (HeadlessException e) {
            System.out.println("Error: HeadlessException - " + e.getMessage());
        }
    }
}
