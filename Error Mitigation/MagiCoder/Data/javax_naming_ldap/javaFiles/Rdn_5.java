import javax.naming.ldap.Rdn;
import javax.naming.ldap.LdapName;
import javax.naming.InvalidNameException;

public class Rdn_5 {
    public static void main(String[] args) {
        try {
            LdapName ldapName = new LdapName("cn=John Doe,ou=People,dc=example,dc=com", LdapName.RDN_ORDER);
            Rdn rdn = ldapName.getRdns().get(0);
            System.out.println(rdn.toString());
        } catch (InvalidNameException e) {
            e.printStackTrace();
        }
    }
}
