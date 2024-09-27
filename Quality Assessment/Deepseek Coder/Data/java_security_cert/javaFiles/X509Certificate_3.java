import java.security.cert.X509Certificate;
import java.util.Date;

public class X509Certificate_3 {
    public static void main(String[] args) {
        // Assuming you have a X509Certificate instance named 'cert'
        X509Certificate cert = null; // Replace with your X509Certificate instance

        // Get the NotBefore date
        Date notBefore = cert.getNotBefore();

        // Print the NotBefore date
        System.out.println("NotBefore: " + notBefore);
    }
}
