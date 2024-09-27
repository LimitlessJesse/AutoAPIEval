import java.awt.Desktop;
import java.net.URI;

public class Desktop_2 {
    public static void main(String[] args) throws Exception {
        Desktop desktop = Desktop.getDesktop();
        URI uri = new URI("http://www.google.com");
        desktop.browse(uri);
    }
}
