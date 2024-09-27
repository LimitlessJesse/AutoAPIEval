import javax.swing.JOptionPane;
import java.awt.Component;

public class JOptionPane_3 {
    public static void main(String[] args) {
        Component parentComponent = null; // Set your parent component here
        Object message = "Enter your input:"; // Message to display
        
        try {
            String userInput = JOptionPane.showInputDialog(parentComponent, message);
            System.out.println("User input: " + userInput);
        } catch (HeadlessException e) {
            System.out.println("Error: HeadlessException - " + e.getMessage());
        }
    }
}
