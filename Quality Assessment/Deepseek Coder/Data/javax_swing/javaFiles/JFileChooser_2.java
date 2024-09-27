import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.awt.Component;

public class JFileChooser_2 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        Component parent = null; // set this to your parent component if you have one
        int result = fileChooser.showSaveDialog(parent);

        if (result == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();
            JOptionPane.showMessageDialog(parent, "You chose to save in: " + filePath);
        } else {
            JOptionPane.showMessageDialog(parent, "You chose not to save.");
        }
    }
}
