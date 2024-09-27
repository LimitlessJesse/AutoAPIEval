import javax.security.auth.kerberos.KerberosPrincipal;

public class KerberosPrincipal_3 {
    public static void main(String[] args) {
        KerberosPrincipal principal = new KerberosPrincipal("username@REALM");
        int hashCode = principal.hashCode();
        System.out.println("Hash code for KerberosPrincipal: " + hashCode);
    }
}
