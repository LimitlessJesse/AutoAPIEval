import javax.swing.filechooser.FileView;
import java.io.File;

public class FileView_3 {
    public static void main(String[] args) {
        File file = new File("path_to_your_file");
        FileView fileView = new FileView() {
            @Override
            public String getTypeDescription(File f) {
                return "A JPEG Compressed Image File";
            }
        };
        System.out.println(fileView.getTypeDescription(file));
    }
}
