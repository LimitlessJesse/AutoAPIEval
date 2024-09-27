import javax.naming.Context;
import javax.naming.InitialContext;

public class InitialContext_4 {
    public static void main(String[] args) {
        try {
            String name = "exampleName";
            Context ctx = new InitialContext();
            ctx.unbind(name);
            System.out.println("Successfully unbound: " + name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
