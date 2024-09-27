import javax.swing.filechooser.FileFilter;
import java.io.File;

public class FileFilter_3 {
    public static void main(String[] args) {
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isDirectory() || file.getName().endsWith(".txt");
            }

            @Override
            public String getDescription() {
                return "Text files (*.txt)";
            }
        };

        System.out.println(fileFilter.getDescription());
    }
}
