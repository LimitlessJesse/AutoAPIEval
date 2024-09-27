import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

public class JFileChooser_11 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        FileFilter fileFilter = fileChooser.getFileFilter();

        if (fileFilter!= null) {
            System.out.println("File Filter: " + fileFilter.getDescription());
        } else {
            System.out.println("No file filter set");
        }
    }
}
