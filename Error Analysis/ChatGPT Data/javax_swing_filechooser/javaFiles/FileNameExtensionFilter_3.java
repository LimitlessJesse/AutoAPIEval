import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

public class FileNameExtensionFilter_3 {
    
    public static void main(String[] args) {
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
        File file = new File("example.txt");
        
        boolean result = filter.accept(file);
        System.out.println("File " + file.getName() + " is accepted: " + result);
    }
    
}
