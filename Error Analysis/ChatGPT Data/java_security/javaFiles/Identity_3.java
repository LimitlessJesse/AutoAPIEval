import java.security.Identity;
import java.security.cert.Certificate;

public class Identity_3 {
    public static void main(String[] args) {
        Identity identity = new Identity("John Doe");
        Certificate[] certificates = identity.certificates();
        
        for (Certificate cert : certificates) {
            System.out.println(cert.toString());
        }
    }
}
