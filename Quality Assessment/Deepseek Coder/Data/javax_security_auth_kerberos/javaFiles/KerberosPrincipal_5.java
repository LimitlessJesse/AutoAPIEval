import javax.security.auth.kerberos.KerberosPrincipal;

public class KerberosPrincipal_5 {
    public static void main(String[] args) {
        KerberosPrincipal kerberosPrincipal = new KerberosPrincipal("name", "realm");
        System.out.println(kerberosPrincipal.toString());
    }
}
