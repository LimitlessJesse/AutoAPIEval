import javax.naming.ldap.Rdn;

public class Rdn_5 {
    public static void main(String[] args) {
        Rdn rdn = new Rdn("cn=John Doe");
        System.out.println(rdn.toString());
    }
}
