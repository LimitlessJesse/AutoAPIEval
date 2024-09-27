import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class FileSystemView_5 {
    public static void main(String[] args) {
        FileSystemView fileSystemView = FileSystemView.getFileSystemView();
        File[] files = fileSystemView.getFiles(new File("C:/Users/"), true);
        
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
