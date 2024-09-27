import java.security.cert.X509CertSelector;
import javax.security.auth.x500.X500Principal;

public class X509CertSelector_3 {
    public static void main(String[] args) {
        X509CertSelector certSelector = new X509CertSelector();
        X500Principal subject = new X500Principal("CN=Test Subject");

        certSelector.setSubject(subject);
        
        System.out.println("Subject set successfully: " + certSelector.getSubject().getName());
    }
}
