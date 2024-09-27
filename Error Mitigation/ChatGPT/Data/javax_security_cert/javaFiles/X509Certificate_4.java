import javax.security.cert.X509Certificate;

public class X509Certificate_4 {
    public static void main(String[] args) {
        X509Certificate cert = null; // Initialize X509Certificate object with your certificate
        
        // Get the notBefore date from the validity period of the certificate
        Date notBefore = cert.getNotBefore();
        
        System.out.println("Not Before Date: " + notBefore);
    }
}
