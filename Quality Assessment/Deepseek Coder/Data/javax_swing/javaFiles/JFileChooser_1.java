import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.awt.Component;
import java.io.File;

public class JFileChooser_1 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        Component parent = null; // set this to the parent component if you have one
        int result = fileChooser.showOpenDialog(parent);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        } else {
            System.out.println("No file selected");
        }
    }
}
