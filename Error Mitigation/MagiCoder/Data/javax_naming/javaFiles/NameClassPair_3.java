import javax.naming.*;

public class NameClassPair_3 {
    public static void main(String[] args) {
        try {
            // Create initial context
            Context ctx = new InitialDirContext();

            // Get the NameClassPair
            NameClassPair ncp = (NameClassPair) ctx.lookup("cn=John Doe");

            // Get the class name
            String className = ncp.getClassName();

            System.out.println("Class Name: " + className);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
