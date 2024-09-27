import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.awt.Component;

public class JFileChooser_2 {
    public static void main(String[] args) {
        Component parent = null; // Set parent component as needed

        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(parent);

        if (result == JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(parent, "File saved successfully!");
        } else if (result == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(parent, "Save operation cancelled");
        }
    }
}
