import java.security.CodeSource;
import java.security.cert.Certificate;

public class CodeSource_3 {
    public static void main(String[] args) {
        CodeSource codeSource = Main.class.getProtectionDomain().getCodeSource();
        Certificate[] certificates = codeSource.getCertificates();
        
        if(certificates != null) {
            for(Certificate cert : certificates) {
                System.out.println(cert);
            }
        }
    }
}
