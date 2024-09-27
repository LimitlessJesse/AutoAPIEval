import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Style;

public class DefaultStyledDocument_5 {
    public static void main(String[] args) {
        DefaultStyledDocument doc = new DefaultStyledDocument();
        Style parentStyle = doc.addStyle("parentStyle", null);
        Style childStyle = doc.addStyle("childStyle", parentStyle);
        System.out.println("Styles added successfully: " + parentStyle + ", " + childStyle);
    }
}
