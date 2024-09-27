import javax.swing.filechooser.FileFilter;
import java.io.File;

public class FileFilter_1 {
    public static void main(String[] args) {
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File f) {
                // Implement your logic here to determine if the file should be accepted
                return f.getName().endsWith(".txt"); // Example: Accept only text files
            }

            @Override
            public String getDescription() {
                return "Text files (*.txt)";
            }
        };
    }
}
