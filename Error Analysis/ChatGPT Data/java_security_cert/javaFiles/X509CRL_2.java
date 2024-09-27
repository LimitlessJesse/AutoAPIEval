import java.security.cert.X509CRL;
import java.util.Date;

public class X509CRL_2 {
    public static void main(String[] args) {
        X509CRL crl = /* initialize X509CRL object */;
        Date nextUpdate = crl.getNextUpdate();
        System.out.println("Next update date: " + nextUpdate);
    }
}
