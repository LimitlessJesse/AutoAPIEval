import javax.swing.filechooser.FileFilter;
import java.io.File;

public class FileFilter_2 {
    public static void main(String[] args) {
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File f) {
                // Add your filtering logic here
                return f.getName().endsWith(".txt"); // Example: Accept only files with .txt extension
            }
        };
        
        // Example usage
        File file = new File("example.txt");
        if (filter.accept(file)) {
            System.out.println("File accepted");
        } else {
            System.out.println("File not accepted");
        }
    }
}
