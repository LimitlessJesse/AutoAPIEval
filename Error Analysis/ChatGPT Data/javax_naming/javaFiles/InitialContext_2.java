import javax.naming.InitialContext;
import javax.naming.NamingException;

public class InitialContext_2 {
    public static void main(String[] args) {
        try {
            InitialContext context = new InitialContext();
            context.bind("example", new Object());
            System.out.println("Object bound successfully.");
        } catch (NamingException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
