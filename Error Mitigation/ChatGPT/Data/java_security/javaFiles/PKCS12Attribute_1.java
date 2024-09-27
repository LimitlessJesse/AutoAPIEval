import java.security.PKCS12Attribute;

public class PKCS12Attribute_1 {
    public static void main(String[] args) {
        PKCS12Attribute attribute = new PKCS12Attribute("example");
        String attributeName = attribute.getName();
        System.out.println("Attribute Name: " + attributeName);
    }
}
