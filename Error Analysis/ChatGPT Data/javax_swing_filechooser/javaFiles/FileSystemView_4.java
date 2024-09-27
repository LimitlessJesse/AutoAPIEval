import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class FileSystemView_4 {
    public static void main(String[] args) {
        FileSystemView fileSystemView = FileSystemView.getFileSystemView();
        File defaultDirectory = fileSystemView.getDefaultDirectory();
        System.out.println("Default directory: " + defaultDirectory.getPath());
    }
}
