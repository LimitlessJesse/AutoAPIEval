import javax.security.auth.kerberos.KerberosPrincipal;

public class KerberosPrincipal_3 {
    public static void main(String[] args) {
        KerberosPrincipal principal1 = new KerberosPrincipal("name1", "instance1");
        KerberosPrincipal principal2 = new KerberosPrincipal("name1", "instance1");
        KerberosPrincipal principal3 = new KerberosPrincipal("name2", "instance2");

        System.out.println(principal1.equals(principal2)); // true
        System.out.println(principal1.equals(principal3)); // false
    }
}
