import javax.naming.ldap.LdapName;
import javax.naming.InvalidNameException;

public class LdapName_3 {
    public static void main(String[] args) {
        try {
            LdapName ldapName = LdapName.create("cn=John Doe,ou=users,dc=example,dc=com");
            System.out.println(ldapName.toString());
        } catch (InvalidNameException e) {
            e.printStackTrace();
        }
    }
}
