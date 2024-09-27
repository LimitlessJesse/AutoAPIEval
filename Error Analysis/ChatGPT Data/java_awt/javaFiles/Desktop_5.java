import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Desktop_5 {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
