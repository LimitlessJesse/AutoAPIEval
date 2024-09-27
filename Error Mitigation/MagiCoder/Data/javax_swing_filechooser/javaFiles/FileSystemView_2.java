import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class FileSystemView_2 {
    public static void main(String[] args) {
        FileSystemView fsv = FileSystemView.getFileSystemView();
        File homeDir = fsv.getHomeDirectory();
        System.out.println("Home directory: " + homeDir.getAbsolutePath());
    }
}
