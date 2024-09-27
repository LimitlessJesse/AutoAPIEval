import javax.swing.JFileChooser;
import javax.swing.plaf.metal.MetalFileChooserUI;
import java.io.File;

public class MetalFileChooserUI_4 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        File file = new File("example.txt");
        ensureFileIsVisible(fileChooser, file);
    }

    public static void ensureFileIsVisible(JFileChooser fileChooser, File f) {
        MetalFileChooserUI fileChooserUI = (MetalFileChooserUI) fileChooser.getUI();
        fileChooserUI.ensureFileIsVisible(fileChooser, f);
    }
}
