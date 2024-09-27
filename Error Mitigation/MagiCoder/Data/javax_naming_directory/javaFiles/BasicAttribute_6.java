import javax.naming.*;
import javax.naming.directory.*;

public class BasicAttribute_6 {
    public static void main(String[] args) {
        try {
            // Create a new context
            DirContext ctx = new InitialDirContext();

            // Create a new attribute
            Attribute attr = new BasicAttribute("cn");

            // Add a value to the attribute
            attr.add("John Doe");

            // Get the value of the attribute
            Object value = attr.get();

            // Print the value
            System.out.println(value);

            // Close the context
            ctx.close();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
