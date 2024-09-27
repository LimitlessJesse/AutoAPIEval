import java.security.CodeSource;
import java.security.cert.Certificate;

public class CodeSource_1 {
    public static void main(String[] args) {
        CodeSource codeSource = new CodeSource(null, null); // Create a CodeSource object
        Certificate[] certificates = codeSource.getCertificates(); // Get the certificates associated with the CodeSource
        if(certificates != null) {
            for(Certificate cert : certificates) {
                System.out.println(cert);
            }
        } else {
            System.out.println("No certificates found.");
        }
    }
}
