import java.security.PKCS12Attribute;

public class PKCS12Attribute_4 {
    public static void main(String[] args) {
        PKCS12Attribute attribute = new PKCS12Attribute();
        byte[] encoded = attribute.getEncoded();
        System.out.println("Encoded value: " + new String(encoded));
    }
}
