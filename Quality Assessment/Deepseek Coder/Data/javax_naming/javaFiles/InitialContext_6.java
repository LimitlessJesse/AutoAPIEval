import javax.naming.InitialContext;
import javax.naming.NamingException;

public class InitialContext_6 {
    public static void main(String[] args) {
        InitialContext ctx = null;
        try {
            ctx = new InitialContext();
            // Perform some operations with ctx
        } catch (NamingException e) {
            e.printStackTrace();
        } finally {
            if (ctx!= null) {
                try {
                    ctx.close();
                } catch (NamingException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
