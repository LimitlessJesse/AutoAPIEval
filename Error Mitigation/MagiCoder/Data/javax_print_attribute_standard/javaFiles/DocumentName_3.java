import javax.print.attribute.standard.DocumentName;

public class DocumentName_3 {
    public static void main(String[] args) {
        DocumentName doc1 = new DocumentName("Document1", null);
        DocumentName doc2 = new DocumentName("Document2", null);
        DocumentName doc3 = new DocumentName("Document1", null);

        System.out.println(doc1.equals(doc2)); // Output: false
        System.out.println(doc1.equals(doc3)); // Output: true
    }
}
