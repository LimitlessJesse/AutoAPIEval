import javax.naming.ldap.LdapName;
import javax.naming.InvalidNameException;

public class LdapName_3 {
    public static void main(String[] args) {
        try {
            LdapName ldapName = new LdapName("cn=John Doe,ou=People,dc=example,dc=com");
            int size = ldapName.size();
            System.out.println("Number of components in the LDAP name: " + size);
        } catch (InvalidNameException e) {
            e.printStackTrace();
        }
    }
}
