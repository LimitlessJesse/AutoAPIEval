import javax.swing.JOptionPane;
import java.awt.Component;

public class JOptionPane_5 {
    public static void main(String[] args) {
        Component parentComponent = null;
        Object message = "This is a message";
        
        JOptionPane.showInternalMessageDialog(parentComponent, message);
    }
}
