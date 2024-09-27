import java.security.CodeSource;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.net.URL;
import java.util.Arrays;

public class CodeSource_3 {
    public static void main(String[] args) throws CertificateException {
        URL url1 = new URL("http://example.com");
        Certificate[] certs1 = new Certificate[] {
            CertificateFactory.getInstance("X.509").generateCertificate(
                CodeSource_3.class.getResourceAsStream("/cert1.der"))
        };
        CodeSource cs1 = new CodeSource(url1, certs1);

        URL url2 = new URL("http://example.com");
        Certificate[] certs2 = new Certificate[] {
            CertificateFactory.getInstance("X.509").generateCertificate(
                CodeSource_3.class.getResourceAsStream("/cert2.der"))
        };
        CodeSource cs2 = new CodeSource(url2, certs2);

        System.out.println(cs1.equals(cs2));
    }
}
