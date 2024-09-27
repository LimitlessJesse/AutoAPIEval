import javax.security.auth.x500.X500Principal;

public class X500Principal_5 {
    public static void main(String[] args) {
        X500Principal x500Principal = new X500Principal("CN=John Doe, O=Acme, C=US");
        int hashCode = x500Principal.hashCode();
        System.out.println("Hash code for X500Principal: " + hashCode);
    }
}
