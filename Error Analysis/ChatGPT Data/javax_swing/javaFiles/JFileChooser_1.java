import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Component;

public class JFileChooser_1 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
        Component parent = null; // specify the parent component here
        int returnValue = fileChooser.showOpenDialog(parent);
        
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            System.out.println("User selected the file: " + fileChooser.getSelectedFile().getName());
        } else {
            System.out.println("User cancelled the file selection");
        }
    }
}
