import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Desktop_3 {
    public static void main(String[] args) {
        try {
            Desktop desktop = Desktop.getDesktop();
            URI mailto = new URI("mailto", "user@example.com", null);
            desktop.mail(mailto);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
