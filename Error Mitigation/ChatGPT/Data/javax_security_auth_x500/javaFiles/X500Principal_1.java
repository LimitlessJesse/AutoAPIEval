import javax.security.auth.x500.X500Principal;

public class X500Principal_1 {
    public static void main(String[] args) {
        X500Principal x500Principal = new X500Principal("CN=John Doe, OU=Java Development, O=Example Corp, C=US");
        String name = x500Principal.getName();
        System.out.println("Distinguished Name: " + name);
    }
}
