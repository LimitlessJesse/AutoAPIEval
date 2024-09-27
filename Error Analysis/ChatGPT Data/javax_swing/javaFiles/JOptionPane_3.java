import javax.swing.JOptionPane;
import java.awt.Component;

public class JOptionPane_3 {
    public static void main(String[] args) {
        Component parentComponent = null; // You can pass a reference to a parent component here
        Object message = "Hello, World!";
        
        JOptionPane.showMessageDialog(parentComponent, message);
    }
}
