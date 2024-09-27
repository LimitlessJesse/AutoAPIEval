import java.security.cert.CertPath;
import java.security.cert.X509Certificate;
import java.util.Arrays;

public class CertPath_6 {
    public static void main(String[] args) throws Exception {
        CertPath certPath = CertPath.getInstance("X509");
        X509Certificate cert = (X509Certificate) certPath.getCertificates().toArray()[0];
        System.out.println(cert.getType());
    }
}
