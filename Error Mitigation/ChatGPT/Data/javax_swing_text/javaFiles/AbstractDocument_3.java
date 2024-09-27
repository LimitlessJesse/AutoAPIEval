import javax.swing.text.Element;
import javax.swing.text.AbstractDocument;

public class AbstractDocument_3 {
    public static void main(String[] args) {
        AbstractDocument document = new AbstractDocument();
        Element rootElement = document.getDefaultRootElement();
        System.out.println("Root Element: " + rootElement);
    }
}
