import javax.print.attribute.standard.DocumentName;

public class DocumentName_4 {
    public static void main(String[] args) {
        DocumentName name1 = new DocumentName("Document1", null);
        DocumentName name2 = new DocumentName("Document1", null);
        
        boolean result = name1.equals(name2);
        System.out.println(result); // Output: true
    }
}
