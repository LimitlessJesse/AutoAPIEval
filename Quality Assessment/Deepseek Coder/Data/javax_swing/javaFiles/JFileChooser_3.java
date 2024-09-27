import javax.swing.JFileChooser;
import java.io.File;

public class JFileChooser_3 {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("C:\\")); // Set the current directory to C:\
        System.out.println("Current directory: " + chooser.getCurrentDirectory());
    }
}
