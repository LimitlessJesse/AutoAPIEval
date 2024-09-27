import javax.security.auth.kerberos.KerberosPrincipal;

public class KerberosPrincipal_4 {
    public static void main(String[] args) {
        KerberosPrincipal principal = new KerberosPrincipal("username@REALM");
        System.out.println(principal.toString());
    }
}
