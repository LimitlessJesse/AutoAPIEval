import javax.security.auth.x500.X500Principal;

public class X500Principal_5 {
    public static void main(String[] args) {
        X500Principal principal = new X500Principal("CN=John Doe, OU=IT, O=Example Inc., C=US");
        System.out.println(principal.toString());
    }
}
