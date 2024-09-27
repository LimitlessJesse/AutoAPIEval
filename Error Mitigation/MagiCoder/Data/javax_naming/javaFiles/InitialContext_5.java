import javax.naming.*;

public class InitialContext_5 {
    public static void main(String[] args) {
        try {
            // Create initial context
            InitialContext ctx = new InitialContext();

            // Create a new subcontext
            Context subctx = ctx.createSubcontext("newSubcontext");

            // Close the context
            ctx.close();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
