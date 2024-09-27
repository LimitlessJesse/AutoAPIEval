import java.security.cert.X509CRL;
import java.security.cert.CRLException;
import java.util.Date;

public class X509CRL_2 {
    public static void main(String[] args) {
        try {
            X509CRL crl = new X509CRL("path_to_your_crl_file");
            Date nextUpdate = crl.getNextUpdate();
            System.out.println("Next Update: " + nextUpdate);
        } catch (CRLException e) {
            e.printStackTrace();
        }
    }
}
