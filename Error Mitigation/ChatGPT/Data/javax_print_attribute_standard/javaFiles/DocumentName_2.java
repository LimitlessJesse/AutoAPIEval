import javax.print.attribute.standard.DocumentName;

public class DocumentName_2 {
    public static void main(String[] args) {
        DocumentName documentName1 = new DocumentName("Document1");
        DocumentName documentName2 = new DocumentName("Document1");
        
        boolean isEqual = documentName1.equals(documentName2);
        System.out.println("Are the document names equal? " + isEqual);
    }
}
