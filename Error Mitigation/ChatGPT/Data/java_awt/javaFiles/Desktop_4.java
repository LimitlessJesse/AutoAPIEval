import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

public class Desktop_4 {
    public static void main(String[] args) {
        try {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URI("https://www.example.com"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
