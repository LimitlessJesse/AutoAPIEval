import javax.naming.InvalidNameException;
import javax.naming.ldap.LdapName;

public class LdapName_3 {
    public static void main(String[] args) {
        try {
            LdapName ldapName = new LdapName("cn=John,ou=Users,dc=example,dc=com");
            System.out.println("Is the LdapName empty? " + ldapName.isEmpty());
        } catch (InvalidNameException e) {
            e.printStackTrace();
        }
    }
}
