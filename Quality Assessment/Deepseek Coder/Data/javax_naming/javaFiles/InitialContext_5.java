import javax.naming.*;
import java.util.Enumeration;

public class InitialContext_5 {
    public static void main(String[] args) {
        try {
            // Create an initial context
            InitialContext ctx = new InitialContext();

            // Specify the name of the naming context
            String name = "java.naming.provider.url";

            // Get the naming enumeration
            NamingEnumeration<NameClassPair> list = ctx.list(name);

            // Iterate over the enumeration
            while (list.hasMoreElements()) {
                NameClassPair pair = list.nextElement();
                System.out.println("Name: " + pair.getName() + ", Class: " + pair.getClassName());
            }

            // Close the context
            ctx.close();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
