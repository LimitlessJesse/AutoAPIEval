import java.awt.Image;
import java.awt.Toolkit;

public class Toolkit_1 {
    public static void main(String[] args) {
        String filename = "example.jpg";
        Image image = Toolkit.getDefaultToolkit().getImage(filename);
        
        // Now you can use the 'image' object for further operations
    }
}
