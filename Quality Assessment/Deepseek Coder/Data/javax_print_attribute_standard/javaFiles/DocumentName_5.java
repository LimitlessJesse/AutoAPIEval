import javax.print.attribute.standard.DocumentName;

public class DocumentName_5 {
    public static void main(String[] args) {
        DocumentName doc1 = new DocumentName("Test Document", "en");
        DocumentName doc2 = new DocumentName("Test Document", "en");

        boolean isEqual = doc1.equals(doc2);

        System.out.println("Are the two DocumentName objects equal? " + isEqual);
    }
}
