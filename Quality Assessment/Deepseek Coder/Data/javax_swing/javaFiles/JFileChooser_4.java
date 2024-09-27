import javax.swing.JFileChooser;
import java.io.File;

public class JFileChooser_4 {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        File currentDirectory = chooser.getCurrentDirectory();
        System.out.println("Current Directory: " + currentDirectory.getAbsolutePath());
    }
}
