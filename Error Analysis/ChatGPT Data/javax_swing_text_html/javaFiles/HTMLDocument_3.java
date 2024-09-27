import javax.swing.text.html.HTMLDocument;
import javax.swing.text.Element;

public class HTMLDocument_3 {
    public static void main(String[] args) {
        HTMLDocument document = new HTMLDocument();
        Element elem = document.getElement("some_element");
        String html = "<b>Hello World</b>";
        insertAfterEnd(elem, html);
    }
    
    public static void insertAfterEnd(Element elem, String html) {
        try {
            HTMLDocument document = (HTMLDocument) elem.getDocument();
            int endOffset = elem.getEndOffset();
            document.insertAfterEnd(elem, html);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
