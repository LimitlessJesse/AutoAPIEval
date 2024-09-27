import javax.swing.JFileChooser;
import javax.swing.plaf.metal.MetalFileChooserUI;
import java.io.File;

public class MetalFileChooserUI_1 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        MetalFileChooserUI metalUI = new MetalFileChooserUI(fileChooser);
        File file = new File("example.txt");
        
        metalUI.ensureFileIsVisible(fileChooser, file);
    }
}
