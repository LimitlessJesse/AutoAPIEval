import javax.swing.text.Element;
import javax.swing.text.html.HTMLDocument;

public class HTMLDocument_5 {
    public static void main(String[] args) {
        Element elem = null; // Initialize Element object
        String html = "<p>This is a new paragraph</p>";
        
        HTMLDocument doc = new HTMLDocument();
        doc.insertBeforeStart(elem, html);
    }
}
