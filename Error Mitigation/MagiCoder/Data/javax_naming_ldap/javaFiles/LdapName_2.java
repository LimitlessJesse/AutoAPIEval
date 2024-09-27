import javax.naming.ldap.LdapName;
import javax.naming.InvalidNameException;

public class LdapName_2 {
    public static void main(String[] args) {
        try {
            LdapName ldapName = new LdapName("cn=John Doe,ou=People,dc=example,dc=com");
            System.out.println(ldapName.get(0)); // Output: cn=John Doe
            System.out.println(ldapName.get(1)); // Output: ou=People
            System.out.println(ldapName.get(2)); // Output: dc=example
            System.out.println(ldapName.get(3)); // Output: dc=com
        } catch (InvalidNameException e) {
            e.printStackTrace();
        }
    }
}
