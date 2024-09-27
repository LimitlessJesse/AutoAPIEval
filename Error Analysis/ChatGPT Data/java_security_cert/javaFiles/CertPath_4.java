import java.security.cert.CertPath;
import java.util.Iterator;

public class CertPath_4 {
    public static void main(String[] args) {
        // Create a CertPath object
        CertPath certPath = // provide the initialization of CertPath object
        
        // Get the encodings Iterator
        Iterator<String> encodings = certPath.getEncodings();
        
        // Iterate over the encodings
        while (encodings.hasNext()) {
            String encoding = encodings.next();
            System.out.println("Encoding: " + encoding);
        }
    }
}
