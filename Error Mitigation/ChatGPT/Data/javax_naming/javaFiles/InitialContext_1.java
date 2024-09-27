import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class InitialContext_1 {
    public static void main(String[] args) {
        try {
            Context ctx = new InitialContext();
            Object obj = ctx.lookup("exampleName");
            System.out.println(obj.toString());
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
