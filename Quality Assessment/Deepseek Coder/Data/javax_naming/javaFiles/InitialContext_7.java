import javax.naming.InitialContext;
import javax.naming.Context;

public class InitialContext_7 {
    public static void main(String[] args) {
        try {
            Context initCtx = new InitialContext();
            Context envCtx = (Context) initCtx.lookup("java:comp/env");
            System.out.println(envCtx);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
