import javax.security.auth.x500.X500PrivateCredential;

public class X500PrivateCredential_3 {
    public static void main(String[] args) {
        X500PrivateCredential credential = new X500PrivateCredential("alias", "privateKey", "certChain");
        String alias = credential.getAlias();
        System.out.println("Alias: " + alias);
    }
}
