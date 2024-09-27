import javax.naming.ldap.LdapName;
import javax.naming.InvalidNameException;

public class LdapName_2 {
    public static void main(String[] args) {
        try {
            LdapName ldapName = LdapName.fromDnString("cn=John Doe,ou=users,dc=example,dc=com");
            System.out.println("Size of LdapName: " + ldapName.size());
        } catch (InvalidNameException e) {
            e.printStackTrace();
        }
    }
}
