import javax.swing.text.Element;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.BadLocationException;
import java.io.IOException;

public class HTMLDocument_5 {
    public static void main(String[] args) {
        HTMLDocument document = new HTMLDocument();
        Element elem = document.getElement("body");
        String htmlText = "<ul><li>";
        
        try {
            document.setInnerHTML(elem, htmlText);
        } catch (BadLocationException | IOException e) {
            e.printStackTrace();
        }
    }
}
