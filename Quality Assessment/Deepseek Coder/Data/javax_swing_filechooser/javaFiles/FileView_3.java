import javax.swing.filechooser.FileSystemView;
import javax.swing.filechooser.FileView;
import java.io.File;

public class FileView_3 {
    public static void main(String[] args) {
        FileSystemView fsv = FileSystemView.getFileSystemView();
        FileView fv = fsv.getFileView();

        File file = new File("C:\\");
        String description = fv.getTypeDescription(file);

        System.out.println("Type description: " + description);
    }
}
