import java.security.PKCS12Attribute;

public class PKCS12Attribute_4 {
    public static void main(String[] args) {
        PKCS12Attribute attribute1 = new PKCS12Attribute();
        PKCS12Attribute attribute2 = new PKCS12Attribute();
        
        boolean result = attribute1.equals(attribute2);
        System.out.println("Are the PKCS12Attributes equal? " + result);
    }
}
