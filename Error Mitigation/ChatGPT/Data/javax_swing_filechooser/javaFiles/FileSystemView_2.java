import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class FileSystemView_2 {
    public static void main(String[] args) {
        FileSystemView fileSystemView = FileSystemView.getFileSystemView();
        File defaultDirectory = fileSystemView.getDefaultDirectory();
        System.out.println("Default starting directory: " + defaultDirectory.getAbsolutePath());
    }
}
