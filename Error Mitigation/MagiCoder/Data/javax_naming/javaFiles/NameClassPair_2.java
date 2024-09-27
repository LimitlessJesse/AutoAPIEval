import javax.naming.*;

public class NameClassPair_2 {
    public static void main(String[] args) {
        try {
            // Create a context
            Context ctx = new InitialContext();

            // Get a NameClassPair
            NameClassPair ncp = (NameClassPair) ctx.lookup("java:comp/env/myService");

            // Get the name
            String name = ncp.getName();

            System.out.println("Name: " + name);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
