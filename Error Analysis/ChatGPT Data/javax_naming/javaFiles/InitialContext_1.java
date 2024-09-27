import javax.naming.InitialContext;
import javax.naming.NamingException;

public class InitialContext_1 {
    public static void main(String[] args) {
        try {
            InitialContext ctx = new InitialContext();
            Object obj = ctx.lookup("java:comp/env/jdbc/mydatasource");
            System.out.println(obj.toString());
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
