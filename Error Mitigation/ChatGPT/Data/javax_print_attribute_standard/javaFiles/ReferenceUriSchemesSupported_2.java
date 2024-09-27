import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import javax.print.attribute.Attribute;

public class ReferenceUriSchemesSupported_2 {
    public static void main(String[] args) {
        ReferenceUriSchemesSupported attribute = new ReferenceUriSchemesSupported("http");
        Class<? extends Attribute> category = attribute.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
