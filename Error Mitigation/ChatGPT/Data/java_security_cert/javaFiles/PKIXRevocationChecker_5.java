import java.net.URI;
import java.security.cert.PKIXRevocationChecker;

public class PKIXRevocationChecker_5 {
    public static void main(String[] args) {
        PKIXRevocationChecker revChecker = new PKIXRevocationChecker();
        URI uri = URI.create("http://ocsp.example.com");
        revChecker.setOcspResponder(uri);
    }
}
