import java.security.CodeSource;
import java.security.cert.Certificate;
import java.net.URL;

public class CodeSource_5 {
    public static void main(String[] args) {
        try {
            CodeSource codeSource = CodeSource_5.class.getProtectionDomain().getCodeSource();
            if (codeSource!= null) {
                URL location = codeSource.getLocation();
                Certificate[] certificates = codeSource.getCertificates();
                System.out.println("CodeSource: " + codeSource.toString());
                System.out.println("Location: " + location.toString());
                System.out.println("Certificates: ");
                for (Certificate certificate : certificates) {
                    System.out.println(certificate.toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
