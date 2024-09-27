import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

public class Desktop_5 {
    public static void main(String[] args) {
        try {
            Desktop desktop = Desktop.getDesktop();
            URI mailtoURI = new URI("mailto:test@example.com?subject=Hello&body=Hello%20World");
            desktop.mail(mailtoURI);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
