import javax.security.auth.x500.X500Principal;

public class X500Principal_3 {
    public static void main(String[] args) {
        X500Principal x500Principal = new X500Principal("CN=John Doe, O=Acme, C=US");
        String name = x500Principal.getName("RFC2253");
        System.out.println(name);
    }
}
