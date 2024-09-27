import javax.security.auth.x500.X500Principal;

public class X500Principal_4 {
    public static void main(String[] args) {
        X500Principal principal1 = new X500Principal("CN=John Doe, O=Example Organization");
        X500Principal principal2 = new X500Principal("CN=John Doe, O=Example Organization");

        boolean isEqual = principal1.equals(principal2);
        System.out.println("Are the X500Principals equal? " + isEqual);
    }
}
