import javax.swing.JFileChooser;
import javax.swing.plaf.FileChooserUI;
import java.io.File;

public class FileChooserUI_1 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        File file = new File("example.txt");
        
        FileChooserUI fileChooserUI = fileChooser.getUI();
        fileChooserUI.ensureFileIsVisible(fileChooser, file);
    }
}
