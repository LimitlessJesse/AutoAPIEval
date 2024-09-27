import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class FileSystemView_5 {
    public static void main(String[] args) {
        FileSystemView fsv = FileSystemView.getFileSystemView();
        File[] files = fsv.getFiles(new File("/"), true);
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
