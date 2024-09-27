import javax.naming.Context;
import javax.naming.NamingException;

public class InitialContext_4 {
    public static void main(String[] args) {
        try {
            Context ctx = new InitialContext();
            // Perform naming operations here...
            ctx.close();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
