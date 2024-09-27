import javax.swing.filechooser.FileView;
import java.io.File;

public class FileView_4 {
    public static void main(String[] args) {
        File file = new File("path_to_your_file");
        FileView fileView = new FileView() {
            @Override
            public String getName(File f) {
                return f.getName();
            }

            @Override
            public String getTypeDescription(File f) {
                return "Your file type description";
            }

            @Override
            public Icon getIcon(File f) {
                return null; // You can return your own icon here
            }
        };

        System.out.println(fileView.getIcon(file));
    }
}
