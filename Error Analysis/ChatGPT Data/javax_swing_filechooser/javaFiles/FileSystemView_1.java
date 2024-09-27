import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class FileSystemView_1 {
    public static void main(String[] args) {
        FileSystemView fileSystemView = FileSystemView.getFileSystemView();
        File[] roots = fileSystemView.getRoots();
        
        for (File root : roots) {
            System.out.println(root);
        }
    }
}
