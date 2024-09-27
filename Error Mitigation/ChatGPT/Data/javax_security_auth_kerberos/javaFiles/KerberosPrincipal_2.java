import javax.security.auth.kerberos.KerberosPrincipal;

public class KerberosPrincipal_2 {
    public static void main(String[] args) {
        KerberosPrincipal principal1 = new KerberosPrincipal("user1@EXAMPLE.COM");
        KerberosPrincipal principal2 = new KerberosPrincipal("user1@EXAMPLE.COM");
        
        boolean isEqual = principal1.equals(principal2);
        System.out.println("Are the two principals equal? " + isEqual);
    }
}
