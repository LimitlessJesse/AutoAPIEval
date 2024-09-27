import javax.security.auth.x500.X500PrivateCredential;
import java.security.cert.X509Certificate;

public class X500PrivateCredential_2 {
    public static void main(String[] args) {
        X500PrivateCredential privateCredential = new X500PrivateCredential(null, null);
        X509Certificate certificate = privateCredential.getCertificate();
        System.out.println("X509Certificate retrieved: " + certificate);
    }
}
