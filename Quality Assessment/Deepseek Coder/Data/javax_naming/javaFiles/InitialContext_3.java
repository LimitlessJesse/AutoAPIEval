import javax.naming.InitialContext;
import javax.naming.NamingException;

public class InitialContext_3 {
    public static void main(String[] args) {
        try {
            InitialContext ctx = new InitialContext();
            String name = "MyObject";
            Object obj = new Object();
            ctx.rebind(name, obj);
            System.out.println("Object rebound successfully");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
