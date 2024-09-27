import javax.security.auth.kerberos.KerberosPrincipal;

public class KerberosPrincipal_1 {
    public static void main(String[] args) {
        KerberosPrincipal kerberosPrincipal = new KerberosPrincipal("username@REALM");
        String principalName = kerberosPrincipal.getName();
        System.out.println("Principal Name: " + principalName);
    }
}
