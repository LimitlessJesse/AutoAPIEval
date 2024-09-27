import javax.naming.ldap.Rdn;
import javax.naming.ldap.LdapName;
import javax.naming.InvalidNameException;

public class Rdn_3 {
    public static void main(String[] args) throws InvalidNameException {
        LdapName ldapName = new LdapName("cn=John Doe,ou=People,dc=example,dc=com");
        Rdn rdn = ldapName.getRdns().get(0);
        String type = rdn.getType();
        System.out.println("Type: " + type);
    }
}
