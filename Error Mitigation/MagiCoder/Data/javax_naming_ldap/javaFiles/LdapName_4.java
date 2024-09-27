import javax.naming.ldap.LdapName;
import javax.naming.InvalidNameException;
import javax.naming.ldap.Rdn;
import java.util.List;

public class LdapName_4 {
    public static void main(String[] args) {
        try {
            LdapName ldapName = new LdapName("cn=John Doe,ou=People,dc=example,dc=com", LdapName.RDN_CASE_IGNORE);
            System.out.println(ldapName.toString());
        } catch (InvalidNameException e) {
            e.printStackTrace();
        }
    }
}
