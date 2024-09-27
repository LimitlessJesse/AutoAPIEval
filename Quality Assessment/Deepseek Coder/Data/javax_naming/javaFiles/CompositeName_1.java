import javax.naming.CompositeName;
import javax.naming.Name;
import javax.naming.NameClassPair;
import javax.naming.NameParser;
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import java.util.Hashtable;

public class CompositeName_1 {
    public static void main(String[] args) throws Exception {
        Hashtable<String, String> env = new Hashtable<>();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        env.put(Context.PROVIDER_URL, "ldap://localhost:389/dc=example,dc=com");
        DirContext ctx = new InitialDirContext(env);

        NameParser np = NameParser.getInstance();
        Name base = np.parse("dc=example,dc=com");
        CompositeName cn = new CompositeName(base, "ou=users");

        Attributes attrs = ctx.getAttributes(cn, new String[]{"cn"});
        Attribute attr = attrs.get("cn");
        System.out.println(attr.size());

        ctx.close();
    }
}
