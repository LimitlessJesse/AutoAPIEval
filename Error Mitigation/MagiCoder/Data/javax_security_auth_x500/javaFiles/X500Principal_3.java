import javax.security.auth.x500.X500Principal;

public class X500Principal_3 {
    public static void main(String[] args) {
        try {
            X500Principal principal1 = new X500Principal("CN=John Doe, OU=IT, O=ABC Inc., C=US");
            X500Principal principal2 = new X500Principal("CN=John Doe, OU=IT, O=ABC Inc., C=US");
            X500Principal principal3 = new X500Principal("CN=Jane Doe, OU=IT, O=ABC Inc., C=US");

            System.out.println(principal1.equals(principal2)); // true
            System.out.println(principal1.equals(principal3)); // false
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
