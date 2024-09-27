import javax.swing.text.AbstractDocument;
import javax.swing.text.Element;

public class AbstractDocument_3 {
    public static void main(String[] args) {
        AbstractDocument document = new AbstractDocument();
        Element rootElement = document.getDefaultRootElement();
        System.out.println(rootElement);
    }
}
