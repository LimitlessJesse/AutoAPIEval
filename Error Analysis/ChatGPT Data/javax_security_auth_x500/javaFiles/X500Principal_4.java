import javax.security.auth.x500.X500Principal;

public class X500Principal_4 {
    public static void main(String[] args) {
        X500Principal principal = new X500Principal("CN=John Doe, O=ACME Corporation, C=US");
        String principalString = principal.toString();
        System.out.println(principalString);
    }
}
