import java.security.cert.X509CRLSelector;
import java.util.Date;

public class X509CRLSelector_2 {
    public static void main(String[] args) {
        X509CRLSelector crlSelector = new X509CRLSelector();
        Date date = new Date();
        crlSelector.setDateAndTime(date);
    }
}
