import javax.swing.text.Element;
import javax.swing.text.StyledDocument;
import javax.swing.text.AbstractDocument;

public class DefaultStyledDocument_4 {
    public static void main(String[] args) {
        StyledDocument styledDocument = new DefaultStyledDocument();
        Element paragraphElement = styledDocument.getParagraphElement(0);
        System.out.println(paragraphElement);
    }
}
