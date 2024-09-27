import javax.swing.text.html.HTMLWriter;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.Element;
import javax.swing.text.AbstractWriter;

public class HTMLWriter_1 {
    public static void main(String[] args) {
        HTMLWriter writer = new HTMLWriter();
        HTMLDocument doc = new HTMLDocument();
        Element element = doc.getDefaultRootElement();
        
        try {
            writer.write(element, 0, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
