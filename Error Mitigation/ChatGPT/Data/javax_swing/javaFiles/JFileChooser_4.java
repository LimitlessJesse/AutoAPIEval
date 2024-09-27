import javax.swing.JFileChooser;
import java.io.File;

public class JFileChooser_4 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
        
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File[] selectedFiles = fileChooser.getSelectedFiles();
            for (File file : selectedFiles) {
                System.out.println("Selected file: " + file.getAbsolutePath());
            }
        }
    }
}
