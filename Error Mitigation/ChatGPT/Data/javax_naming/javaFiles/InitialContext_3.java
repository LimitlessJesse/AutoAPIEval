import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class InitialContext_3 {
    public static void main(String[] args) {
        try {
            Context ctx = new InitialContext();
            String name = "exampleName";
            Object obj = new Object(); // Object to bind
            ctx.rebind(name, obj);
            System.out.println("Object bound successfully.");
        } catch (NamingException e) {
            System.out.println("Error binding object: " + e.getMessage());
        }
    }
}
