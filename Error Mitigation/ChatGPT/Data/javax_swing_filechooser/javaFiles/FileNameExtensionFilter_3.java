import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

public class FileNameExtensionFilter_3 {
    public static void main(String[] args) {
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
        File file = new File("example.txt");
        
        if(filter.accept(file)) {
            System.out.println("File accepted");
        } else {
            System.out.println("File not accepted");
        }
    }
}
