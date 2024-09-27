import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class InitialContext_1 {
    public static void main(String[] args) {
        try {
            // Create initial context
            Context ctx = new InitialContext();

            // Create subcontext
            Context subCtx = (Context) ctx.createSubcontext("subcontext");

            // Display subcontext name
            System.out.println("Subcontext name: " + subCtx.getName());

        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
