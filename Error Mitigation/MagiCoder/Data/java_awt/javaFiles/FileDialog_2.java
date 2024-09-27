import java.awt.FileDialog;
import java.awt.Frame;

public class FileDialog_2 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        FileDialog fileDialog = new FileDialog(frame, "Select File", FileDialog.LOAD);
        fileDialog.setDirectory("C:\\"); // Set the directory to C:\\
        fileDialog.setVisible(true);

        String directory = fileDialog.getDirectory();
        String file = fileDialog.getFile();

        if (directory!= null && file!= null) {
            System.out.println("Directory: " + directory);
            System.out.println("File: " + file);
        }
    }
}
