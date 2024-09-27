import javax.security.auth.x500.X500Principal;

public class X500Principal_2 {
    public static void main(String[] args) {
        X500Principal principal = new X500Principal("CN=Test");
        byte[] encoded = principal.getEncoded();
        System.out.println("Encoded X500Principal: " + new String(encoded));
    }
}
