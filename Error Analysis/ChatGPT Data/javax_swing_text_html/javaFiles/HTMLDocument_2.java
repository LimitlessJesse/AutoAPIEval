import javax.swing.text.Element;
import javax.swing.text.html.HTMLDocument;

public class HTMLDocument_2 {
    public static void main(String[] args) {
        Element elem = null; // initialize with the desired element
        String html = "<b>Hello World!</b>"; // HTML content to set
        
        HTMLDocument document = new HTMLDocument();
        document.setInnerHTML(elem, html);
    }
}
