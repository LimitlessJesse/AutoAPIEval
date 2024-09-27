import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class FileSystemView_4 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        FileSystemView fileSystemView = fileChooser.getFileSystemView();
        File defaultDirectory = fileSystemView.getDefaultDirectory();
        System.out.println("Default Directory: " + defaultDirectory.getAbsolutePath());
    }
}
