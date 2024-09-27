import javax.naming.ldap.LdapName;
import javax.naming.Name;
import javax.naming.InvalidNameException;

public class LdapName_4 {
    public static void main(String[] args) {
        try {
            LdapName ldapName = new LdapName("cn=John,ou=Users,dc=example,dc=com");
            int size = ldapName.size();
            System.out.println("Number of components in LDAP name: " + size);
        } catch (InvalidNameException e) {
            System.out.println("Invalid LDAP name");
        }
    }
}
