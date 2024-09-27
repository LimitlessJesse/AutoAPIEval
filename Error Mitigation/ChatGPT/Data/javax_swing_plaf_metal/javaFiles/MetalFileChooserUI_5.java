import javax.swing.JFileChooser;
import javax.swing.plaf.metal.MetalFileChooserUI;

public class MetalFileChooserUI_5 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        MetalFileChooserUI metalUI = new MetalFileChooserUI(fileChooser);
        metalUI.rescanCurrentDirectory(fileChooser);
    }
}
