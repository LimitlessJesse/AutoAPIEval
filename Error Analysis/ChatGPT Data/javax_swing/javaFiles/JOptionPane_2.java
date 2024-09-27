import javax.swing.JOptionPane;

public class JOptionPane_2 {
    public static void main(String[] args) {
        String userInput = JOptionPane.showInputDialog(null, "Enter your name:");
        JOptionPane.showMessageDialog(null, "Hello, " + userInput);
    }
}
