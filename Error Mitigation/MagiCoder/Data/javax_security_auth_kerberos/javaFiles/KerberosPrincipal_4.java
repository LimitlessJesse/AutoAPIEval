import javax.security.auth.kerberos.KerberosPrincipal;

public class KerberosPrincipal_4 {
    public static void main(String[] args) {
        KerberosPrincipal principal = new KerberosPrincipal("name");
        int hashCode = principal.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
