import javax.security.auth.x500.X500Principal;

public class X500Principal_1 {
    public static void main(String[] args) {
        X500Principal principal = new X500Principal("CN=John Doe, O=Example Organization, C=US");
        System.out.println(principal.getName());
    }
}
