import java.awt.FileDialog;
import java.awt.Frame;

public class FileDialog_1 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        FileDialog fileDialog = new FileDialog(frame, "Select File");
        fileDialog.setVisible(true);
        
        String directory = fileDialog.getDirectory();
        System.out.println("Selected directory: " + directory);
    }
}
