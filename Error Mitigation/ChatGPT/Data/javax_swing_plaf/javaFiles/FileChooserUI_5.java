import javax.swing.JFileChooser;
import javax.swing.plaf.FileChooserUI;

public class FileChooserUI_5 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        FileChooserUI fileChooserUI = fileChooser.getUI();
        fileChooserUI.rescanCurrentDirectory(fileChooser);
    }
}
