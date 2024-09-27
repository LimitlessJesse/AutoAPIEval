import javax.swing.text.Element;
import javax.swing.text.PlainDocument;

public class PlainDocument_4 {
    public static void main(String[] args) {
        PlainDocument document = new PlainDocument();
        Element rootElement = document.getDefaultRootElement();
        System.out.println("Default root element: " + rootElement);
    }
}
