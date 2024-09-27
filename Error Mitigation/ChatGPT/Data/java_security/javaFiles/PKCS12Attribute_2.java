import java.security.PKCS12Attribute;

public class PKCS12Attribute_2 {
    public static void main(String[] args) {
        PKCS12Attribute attribute = new PKCS12Attribute();
        byte[] encoded = attribute.getEncoded();
        System.out.println("Attribute's DER encoding: " + encoded);
    }
}
