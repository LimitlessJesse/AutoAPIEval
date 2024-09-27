import javax.naming.NamingException;
import javax.naming.ldap.Control;
import javax.naming.ldap.LdapContext;
import javax.naming.ldap.InitialLdapContext;

public class InitialLdapContext_2 {
    public static void main(String[] args) {
        try {
            InitialLdapContext context = new InitialLdapContext();
            Control[] connectControls = context.getConnectControls();
            if (connectControls != null) {
                for (Control control : connectControls) {
                    System.out.println(control);
                }
            } else {
                System.out.println("No connect controls set for this context.");
            }
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
