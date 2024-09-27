import javax.swing.text.AbstractDocument;

public class AbstractDocument_5 {
    public static void main(String[] args) {
        AbstractDocument document = new AbstractDocument();
        document.putProperty("key1", "value1");
        document.putProperty("key2", "value2");
        System.out.println(document.getDocumentProperties());
        
        // Removing a property
        document.putProperty("key1", null);
        System.out.println(document.getDocumentProperties());
    }
}
