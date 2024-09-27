import javax.security.auth.x500.X500PrivateCredential;

public class X500PrivateCredential_3 {
    public static void main(String[] args) {
        X500PrivateCredential credential = new X500PrivateCredential(null, null);
        PrivateKey privateKey = credential.getPrivateKey();
        System.out.println("Private Key: " + privateKey);
    }
}
