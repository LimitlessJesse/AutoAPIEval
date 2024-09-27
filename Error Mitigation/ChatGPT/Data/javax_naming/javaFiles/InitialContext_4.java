import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class InitialContext_4 {
    public static void main(String[] args) {
        try {
            Context ctx = new InitialContext();
            ctx.unbind("exampleName");
            System.out.println("Object unbound successfully");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
