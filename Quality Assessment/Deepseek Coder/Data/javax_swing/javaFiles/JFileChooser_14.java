import javax.swing.JFileChooser;
import java.io.File;

public class JFileChooser_14 {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File[] selectedFiles = chooser.getSelectedFiles();

            for (File file : selectedFiles) {
                System.out.println(file.getAbsolutePath());
            }
        }
    }
}
