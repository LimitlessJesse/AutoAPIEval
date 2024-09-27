import javax.naming.*;

public class InitialContext_3 {
    public static void main(String[] args) {
        try {
            // Create an initial context
            InitialContext ctx = new InitialContext();

            // Define the name of the object to unbind
            Name name = new CompositeName();
            name.add("subcontext");
            name.add("object");

            // Unbind the object
            ctx.unbind(name);

            // Close the context
            ctx.close();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
