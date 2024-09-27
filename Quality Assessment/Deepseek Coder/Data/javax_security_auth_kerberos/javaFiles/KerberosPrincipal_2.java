import javax.security.auth.kerberos.KerberosPrincipal;

public class KerberosPrincipal_2 {
    public static void main(String[] args) {
        KerberosPrincipal kerberosPrincipal = new KerberosPrincipal("user@REALM.COM");
        String realm = kerberosPrincipal.getRealm();
        System.out.println("Realm: " + realm);
    }
}
