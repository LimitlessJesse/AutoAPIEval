import javax.naming.InvalidNameException;
import javax.naming.ldap.LdapName;

public class LdapName_5 {
    public static void main(String[] args) {
        try {
            LdapName ldapName = new LdapName("cn=John Doe,ou=People,dc=example,dc=com");
            System.out.println(ldapName.toString());
        } catch (InvalidNameException e) {
            e.printStackTrace();
        }
    }
}
