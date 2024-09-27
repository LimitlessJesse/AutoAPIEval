import javax.naming.spi.NamingManager;
import java.util.Hashtable;
import javax.naming.Context;

public class NamingManager_2 {
    public static void main(String[] args) {
        try {
            Hashtable<String, String> env = new Hashtable<>();
            env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
            env.put(Context.PROVIDER_URL, "ldap://localhost:389/dc=example,dc=com");
            Context ctx = NamingManager.getInitialContext(env);
            System.out.println("Initial context obtained successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
