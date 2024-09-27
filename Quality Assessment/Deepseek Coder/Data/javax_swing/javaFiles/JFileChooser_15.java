import javax.swing.JFileChooser;
import java.io.File;

public class JFileChooser_15 {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        chooser.setSelectedFile(new File("example.txt"));
    }
}
