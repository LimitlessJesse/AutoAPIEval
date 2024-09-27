import javax.swing.filechooser.FileView;
import java.io.File;

public class FileView_2 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        FileView fileView = new FileView() {
            @Override
            public String getName(File f) {
                return f.getName();
            }
        };
        System.out.println(fileView.getName(file));
    }
}
