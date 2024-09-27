import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Desktop_3 {
    public static void main(String[] args) {
        try {
            URI mailtoURI = new URI("mailto:recipient@example.com?subject=Hello&body=Hello, how are you?");
            Desktop.getDesktop().mail(mailtoURI);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
