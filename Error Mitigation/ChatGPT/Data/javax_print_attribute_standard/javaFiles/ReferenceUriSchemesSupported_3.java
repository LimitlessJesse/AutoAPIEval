import javax.print.attribute.standard.ReferenceUriSchemesSupported;

public class ReferenceUriSchemesSupported_3 {
    public static void main(String[] args) {
        ReferenceUriSchemesSupported attribute = new ReferenceUriSchemesSupported("http:");
        String categoryName = attribute.getName();
        System.out.println("Category Name: " + categoryName);
    }
}
