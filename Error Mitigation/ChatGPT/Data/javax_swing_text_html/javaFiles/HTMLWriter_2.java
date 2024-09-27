import javax.swing.text.AttributeSet;
import javax.swing.text.html.HTMLWriter;

public class HTMLWriter_2 {
    public static void main(String[] args) {
        HTMLWriter writer = new HTMLWriter();
        AttributeSet attributes = null; // initialize with your desired attributes
        try {
            writer.writeAttributes(attributes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
