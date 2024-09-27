import javax.swing.text.Element;
import javax.swing.text.html.HTMLDocument;

public class HTMLDocument_1 {
    public static void main(String[] args) {
        HTMLDocument htmlDocument = new HTMLDocument();
        Element element = htmlDocument.getElement("HelloThere");
        System.out.println(element);
    }
}
