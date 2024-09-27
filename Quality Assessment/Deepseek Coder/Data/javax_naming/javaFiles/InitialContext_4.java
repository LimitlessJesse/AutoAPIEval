import javax.naming.InitialContext;
import javax.naming.NamingException;

public class InitialContext_4 {
    public static void main(String[] args) {
        try {
            // Create an InitialContext
            InitialContext ctx = new InitialContext();

            // Bind a name to an object
            ctx.bind("myObject", "Hello, World!");

            // Unbind the name
            ctx.unbind("myObject");

            // Attempt to retrieve the object
            try {
                Object obj = ctx.lookup("myObject");
                System.out.println(obj);
            } catch (NamingException e) {
                System.out.println("Object has been unbound.");
            }
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
