import javax.swing.text.DefaultStyledDocument;

public class DefaultStyledDocument_ElementSpec_2 {
    public static void main(String[] args) {
        DefaultStyledDocument.ElementSpec elementSpec = new DefaultStyledDocument.ElementSpec(null, DefaultStyledDocument.ElementSpec.EndTagType, null, 0);
        int length = elementSpec.getLength();
        System.out.println("Length: " + length);
    }
}
