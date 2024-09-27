import javax.swing.text.AttributeSet;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTML.Tag;

public class HTMLDocument_Iterator_3 {
    public static void main(String[] args) {
        HTMLDocument.Iterator iterator = new HTMLDocument.Iterator(Tag.A);
        AttributeSet attributes = iterator.getAttributes();
        
        System.out.println("Attributes for <a> tag:");
        System.out.println(attributes.toString());
    }
}
