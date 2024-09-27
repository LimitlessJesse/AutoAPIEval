import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import javax.print.attribute.Attribute;

public class ReferenceUriSchemesSupported_5 {
    public static void main(String[] args) {
        ReferenceUriSchemesSupported reference = new ReferenceUriSchemesSupported("http", "ftp");
        Class<? extends Attribute> category = reference.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
