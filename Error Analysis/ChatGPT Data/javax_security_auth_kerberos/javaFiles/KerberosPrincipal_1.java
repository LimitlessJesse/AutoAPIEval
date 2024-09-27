import javax.security.auth.kerberos.KerberosPrincipal;

public class KerberosPrincipal_1 {
    public static void main(String[] args) {
        KerberosPrincipal principal = new KerberosPrincipal("username@REALM");
        String name = principal.getName();
        System.out.println("Principal name: " + name);
    }
}
