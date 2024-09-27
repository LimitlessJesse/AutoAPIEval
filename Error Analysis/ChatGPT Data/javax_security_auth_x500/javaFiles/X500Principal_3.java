import javax.security.auth.x500.X500Principal;

public class X500Principal_3 {
    public static void main(String[] args) {
        X500Principal x500Principal = new X500Principal("CN=John Doe, O=Company, C=US");
        String name = x500Principal.getName(X500Principal.CANONICAL);
        System.out.println(name);
    }
}
