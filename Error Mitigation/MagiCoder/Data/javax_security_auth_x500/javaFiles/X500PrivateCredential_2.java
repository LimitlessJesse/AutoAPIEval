import javax.security.auth.x500.X500PrivateCredential;
import java.security.PrivateKey;

public class X500PrivateCredential_2 {
    public static void main(String[] args) {
        X500PrivateCredential x500PrivateCredential = new X500PrivateCredential("subjectDN", "keyAlgorithm", "encryptionAlgorithm", "privateKey", "privateKeyPassword");
        PrivateKey privateKey = x500PrivateCredential.getPrivateKey();
        System.out.println(privateKey);
    }
}
