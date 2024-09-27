import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class AbstractDocument_5 {
    public static void main(String[] args) {
        AbstractDocument absDoc = new AbstractDocument();
        Document doc = absDoc.getDefaultRootElement();
        DocumentFilter filter = doc.getDocumentFilter();
        System.out.println(filter);
    }
}
