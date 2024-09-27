import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

public class FileNameExtensionFilter_4 {
    public static void main(String[] args) {
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
        File file = new File("test.jpg");
        System.out.println(filter.accept(file)); // Output: true
    }
}
