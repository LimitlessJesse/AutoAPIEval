import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Desktop_4 {
    public static void main(String[] args) {
        File file = new File("path_to_your_file");
        try {
            Desktop.getDesktop().edit(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
