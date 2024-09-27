import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Desktop_3 {
    public static void main(String[] args) {
        Desktop desktop = Desktop.getDesktop();
        File file = new File("example.txt");
        
        try {
            desktop.edit(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
