import javax.swing.filechooser.FileView;
import java.io.File;

public class FileView_1 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        FileView fileView = new FileView() {
            @Override
            public String getName(File f) {
                return f.getName();
            }
        };
        String fileName = fileView.getName(file);
        System.out.println("File name: " + fileName);
    }
}
