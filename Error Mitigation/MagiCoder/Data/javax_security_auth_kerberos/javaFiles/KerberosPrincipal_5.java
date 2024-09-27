import javax.security.auth.kerberos.KerberosPrincipal;

public class KerberosPrincipal_5 {
    public static void main(String[] args) {
        KerberosPrincipal principal = new KerberosPrincipal("username", "realm");
        System.out.println(principal.toString());
    }
}
