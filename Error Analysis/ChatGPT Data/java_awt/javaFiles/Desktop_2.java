import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;

public class Desktop_2 {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://www.google.com");
            Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }
}
