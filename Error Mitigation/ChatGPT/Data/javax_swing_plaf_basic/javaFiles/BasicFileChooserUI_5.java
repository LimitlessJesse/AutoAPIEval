import javax.swing.JFileChooser;
import javax.swing.plaf.basic.BasicFileChooserUI;

public class BasicFileChooserUI_5 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        BasicFileChooserUI basicUI = new BasicFileChooserUI(fileChooser);
        basicUI.rescanCurrentDirectory(fileChooser);
    }
}
