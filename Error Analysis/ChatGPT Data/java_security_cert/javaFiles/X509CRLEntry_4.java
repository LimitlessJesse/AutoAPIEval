import java.security.cert.X509CRLEntry;
import java.security.cert.CertificateRevokedException;

public class X509CRLEntry_4 {
    public static void main(String[] args) {
        X509CRLEntry crlEntry = new CertificateRevokedException();
        String crlEntryString = crlEntry.toString();
        System.out.println("X509CRLEntry: " + crlEntryString);
    }
}
