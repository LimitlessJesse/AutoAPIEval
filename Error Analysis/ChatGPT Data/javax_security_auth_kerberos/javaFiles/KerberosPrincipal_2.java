import javax.security.auth.kerberos.KerberosPrincipal;

public class KerberosPrincipal_2 {
    public static void main(String[] args) {
        // Create two KerberosPrincipal objects
        KerberosPrincipal principal1 = new KerberosPrincipal("principal1");
        KerberosPrincipal principal2 = new KerberosPrincipal("principal2");

        // Check if the two principals are equal
        boolean isEqual = principal1.equals(principal2);
        System.out.println("Are the two principals equal? " + isEqual);
    }
}
