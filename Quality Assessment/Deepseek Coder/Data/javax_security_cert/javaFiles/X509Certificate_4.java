import java.security.cert.X509Certificate;
import java.util.Date;

public class X509Certificate_4 {
    public static void main(String[] args) {
        // Assuming you have a X509Certificate instance named 'cert'
        X509Certificate cert = null; // Replace with your X509Certificate instance

        // Get the 'Not After' date
        Date notAfter = cert.getNotAfter();

        // Print the 'Not After' date
        System.out.println("Not After: " + notAfter);
    }
}
