import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Desktop_3 {
    public static void main(String[] args) {
        File file = new File("example.txt");

        try {
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                desktop.edit(file);
            } else {
                System.out.println("Desktop is not supported");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
