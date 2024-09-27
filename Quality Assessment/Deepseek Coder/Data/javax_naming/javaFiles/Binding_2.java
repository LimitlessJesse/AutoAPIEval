import javax.naming.*;
import java.util.Hashtable;

public class Binding_2 {
    public static void main(String[] args) {
        try {
            // Create initial context
            Hashtable<String, String> env = new Hashtable<>();
            env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
            env.put(Context.PROVIDER_URL, "ldap://localhost:389");
            DirContext ctx = new InitialDirContext(env);

            // Get object from binding
            NamingEnumeration<Binding> bindings = ctx.listBindings("");
            while (bindings.hasMore()) {
                Binding binding = bindings.next();
                Object obj = binding.getObject();
                System.out.println(obj);
            }

            // Close context
            ctx.close();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
