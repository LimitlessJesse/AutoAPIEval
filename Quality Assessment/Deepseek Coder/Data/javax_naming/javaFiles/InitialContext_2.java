import javax.naming.InitialContext;
import javax.naming.NamingException;

public class InitialContext_2 {
    public static void main(String[] args) {
        try {
            InitialContext ctx = new InitialContext();
            Object obj = ctx.lookup("java:comp/env/jdbc/myDS");
            System.out.println(obj);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
