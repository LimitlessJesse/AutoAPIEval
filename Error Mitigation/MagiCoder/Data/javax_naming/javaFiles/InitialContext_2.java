import javax.naming.*;

public class InitialContext_2 {
    public static void main(String[] args) {
        try {
            // Create a new InitialContext
            InitialContext ctx = new InitialContext();

            // Create a new Object
            Object obj = new Object();

            // Create a new Name
            Name name = new CompositeName();

            // Rebind the name to the object
            ctx.rebind(name, obj);

            // Close the context
            ctx.close();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
