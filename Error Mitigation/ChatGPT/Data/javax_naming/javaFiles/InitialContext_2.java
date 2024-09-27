import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class InitialContext_2 {
    public static void main(String[] args) {
        try {
            Context ctx = new InitialContext();
            String name = "example";
            Object obj = new Object(); // Object to bind
            ctx.bind(name, obj);
            System.out.println("Object bound successfully.");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
