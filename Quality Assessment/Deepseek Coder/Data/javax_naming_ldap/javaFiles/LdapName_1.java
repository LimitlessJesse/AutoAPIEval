import javax.naming.ldap.LdapName;
import javax.naming.InvalidNameException;

public class LdapName_1 {
    public static void main(String[] args) {
        try {
            LdapName ldapName = LdapName.parse("cn=John Doe,ou=users,dc=example,dc=com");
            System.out.println(ldapName.get(0));
        } catch (InvalidNameException e) {
            e.printStackTrace();
        }
    }
}
