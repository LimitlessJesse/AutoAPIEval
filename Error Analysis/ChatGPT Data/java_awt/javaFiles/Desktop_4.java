import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Desktop_4 {
    public static void main(String[] args) {
        try {
            mail( new URI("mailto:test@example.com") );
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void mail(URI mailtoURI) throws IOException {
        Desktop.getDesktop().mail(mailtoURI);
    }
}
