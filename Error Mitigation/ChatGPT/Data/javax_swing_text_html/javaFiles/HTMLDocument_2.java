import javax.swing.text.html.HTMLDocument;
import java.net.URL;

public class HTMLDocument_2 {
    public static void main(String[] args) {
        HTMLDocument htmlDocument = new HTMLDocument();
        URL url = new URL("https://www.example.com");
        htmlDocument.setBase(url);
    }
}
