import javax.print.attribute.standard.DocumentName;

public class DocumentName_1 {
    public static void main(String[] args) {
        DocumentName documentName = new DocumentName("SampleDoc");
        System.out.println(documentName.getName());
    }
}
