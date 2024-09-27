import java.security.PKCS12Attribute;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;

public class PKCS12Attribute_2 {
    public static void main(String[] args) throws CertificateException {
        CertificateFactory cf = CertificateFactory.getInstance("X.509");
        Certificate cert = cf.generateCertificate(PKCS12Attribute_2.class.getResourceAsStream("/certificate.cer"));
        PKCS12Attribute attribute = new PKCS12Attribute(cert.getType(), cert.getEncoded());
        System.out.println(attribute.getName());
    }
}
