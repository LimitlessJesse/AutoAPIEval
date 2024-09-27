import javax.security.cert.X509Certificate;

public class X509Certificate_3 {
    public static void main(String[] args) {
        X509Certificate cert = null; // Initialize X509Certificate object with your certificate
        
        String signatureAlgorithmName = cert.getSigAlgName();
        System.out.println("Signature Algorithm Name: " + signatureAlgorithmName);
    }
}
