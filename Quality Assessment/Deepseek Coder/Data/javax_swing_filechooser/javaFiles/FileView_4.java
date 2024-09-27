import javax.swing.filechooser.FileSystemView;
import javax.swing.filechooser.FileView;
import java.io.File;

public class FileView_4 {
    public static void main(String[] args) {
        FileSystemView fsv = FileSystemView.getFileSystemView();
        FileView fv = fsv.getFileView(new File("C:/"));
        System.out.println(fv.getIcon(new File("C:/")));
    }
}
