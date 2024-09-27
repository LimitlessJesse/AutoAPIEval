import javax.print.attribute.standard.DocumentName;

public class DocumentName_1 {
    public static void main(String[] args) {
        DocumentName docName = new DocumentName("Example Document", "UTF-8");
        String name = docName.getName();
        System.out.println("Document Name: " + name);
    }
}
