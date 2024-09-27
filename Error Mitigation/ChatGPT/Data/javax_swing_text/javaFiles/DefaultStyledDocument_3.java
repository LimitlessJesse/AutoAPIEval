import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Element;

public class DefaultStyledDocument_3 {
    public static void main(String[] args) {
        DefaultStyledDocument doc = new DefaultStyledDocument();
        Element element = doc.getCharacterElement(5);
        System.out.println(element);
    }
}
