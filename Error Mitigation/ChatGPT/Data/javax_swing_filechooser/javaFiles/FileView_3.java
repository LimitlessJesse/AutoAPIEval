import javax.swing.filechooser.FileView;
import java.io.File;

public class FileView_3 {
    public static void main(String[] args) {
        FileView fileView = new FileView() {
            @Override
            public String getName(File f) {
                return f.getName();
            }
        };

        File file = new File("example.txt");
        System.out.println("File name: " + fileView.getName(file));
    }
}
