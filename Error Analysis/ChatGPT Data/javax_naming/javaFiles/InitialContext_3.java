import javax.naming.InitialContext;
import javax.naming.NamingException;

public class InitialContext_3 {
    public static void main(String[] args) {
        try {
            InitialContext ctx = new InitialContext();
            Object obj = new Object(); // Object to be rebound
            ctx.rebind("exampleBinding", obj);
            System.out.println("Object rebound successfully.");
        } catch (NamingException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
