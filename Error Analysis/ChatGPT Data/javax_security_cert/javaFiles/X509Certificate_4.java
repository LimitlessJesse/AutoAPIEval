import javax.security.cert.X509Certificate;

public class X509Certificate_4 {
    public static void main(String[] args) {
        X509Certificate cert = null; // initialize your X509Certificate object here
        Date expirationDate = cert.getNotAfter();
        System.out.println("Expiration Date: " + expirationDate);
    }
}
