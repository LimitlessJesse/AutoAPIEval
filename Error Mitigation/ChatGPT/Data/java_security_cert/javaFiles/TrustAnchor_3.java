import java.security.cert.TrustAnchor;
import javax.security.auth.x500.X500Principal;

public class TrustAnchor_3 {
    public static void main(String[] args) {
        TrustAnchor trustAnchor = new TrustAnchor(new X500Principal("CN=Example CA"), null);
        X500Principal caName = trustAnchor.getCA();
        System.out.println("Most-trusted CA: " + caName.getName());
    }
}
