import javax.print.attribute.standard.DocumentName;
import javax.print.attribute.Attribute;

public class DocumentName_5 {
    public static void main(String[] args) {
        DocumentName documentName = new DocumentName("Sample Document");
        Class<? extends Attribute> category = documentName.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
