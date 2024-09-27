import javax.naming.ldap.Rdn;

public class Rdn_3 {
    public static void main(String[] args) {
        Rdn rdn1 = new Rdn("cn=John+ou=IT");
        Rdn rdn2 = new Rdn("ou=IT+cn=John");

        boolean result = rdn1.equals(rdn2);
        System.out.println("Are the Rdns equal? " + result);
    }
}
