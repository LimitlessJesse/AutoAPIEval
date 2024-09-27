import javax.swing.JFileChooser;
import java.io.File;

public class JFileChooser_3 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        
        int returnValue = fileChooser.showOpenDialog(null);
        
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        } else {
            System.out.println("No file selected.");
        }
    }
}
