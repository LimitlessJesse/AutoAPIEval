import java.awt.FileDialog;
import java.awt.Frame;

public class FileDialog_5 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        FileDialog fileDialog = new FileDialog(frame, "Select File");
        fileDialog.setVisible(true);
        
        String selectedFile = fileDialog.getFile();
        System.out.println("Selected File: " + selectedFile);
    }
}
