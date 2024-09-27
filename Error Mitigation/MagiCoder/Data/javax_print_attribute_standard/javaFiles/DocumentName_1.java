import javax.print.attribute.standard.DocumentName;

public class DocumentName_1 {
    public static void main(String[] args) {
        DocumentName documentName = new DocumentName("My Document", "en");
        String categoryName = documentName.getName();
        System.out.println("Category Name: " + categoryName);
    }
}
