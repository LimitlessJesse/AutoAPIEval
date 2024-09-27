import javax.naming.directory.Attributes;
import javax.naming.directory.BasicAttributes;
import javax.naming.directory.Attribute;
import javax.naming.NamingException;
import javax.naming.InitialDirContext;
import java.util.Hashtable;

public class InitialDirContext_1 {
    public static void main(String[] args) {
        // Create an initial context
        Hashtable<String, String> env = new Hashtable<>();
        env.put("java.naming.factory.initial", "com.sun.jndi.ldap.LdapCtxFactory");
        env.put("java.naming.provider.url", "ldap://localhost:389");
        try {
            InitialDirContext context = new InitialDirContext(env);
            
            // Get attributes of a specific entry
            Attributes attrs = context.getAttributes("cn=John Doe,ou=People,dc=example,dc=com");
            
            // Get a specific attribute by name
            Attribute attr = attrs.get("cn");
            
            System.out.println(attr);
            
            context.close();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
