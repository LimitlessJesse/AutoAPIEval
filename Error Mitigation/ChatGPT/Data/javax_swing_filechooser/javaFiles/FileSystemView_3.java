import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class FileSystemView_3 {
    public static void main(String[] args) {
        FileSystemView fileSystemView = FileSystemView.getFileSystemView();
        File homeDirectory = fileSystemView.getHomeDirectory();
        System.out.println("Home Directory: " + homeDirectory.getAbsolutePath());
    }
}
