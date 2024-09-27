import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JFileChooser_10 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();

        // Create a FileFilter
        FileFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");

        // Set the FileFilter
        fileChooser.setFileFilter(filter);
    }
}
