import javax.print.attribute.standard.ReferenceUriSchemesSupported;

public class ReferenceUriSchemesSupported_1 {
    public static void main(String[] args) {
        ReferenceUriSchemesSupported attribute = new ReferenceUriSchemesSupported("http");
        String name = attribute.getName();
        System.out.println("Name: " + name);
    }
}
