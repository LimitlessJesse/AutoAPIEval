import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class FileSystemView_2 {
    public static void main(String[] args) {
        FileSystemView fsv = FileSystemView.getFileSystemView();
        File homeDirectory = fsv.getHomeDirectory();
        System.out.println("Home Directory: " + homeDirectory);
    }
}
