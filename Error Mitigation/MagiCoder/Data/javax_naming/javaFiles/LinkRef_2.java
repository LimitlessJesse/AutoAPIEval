import javax.naming.*;

public class LinkRef_2 {
    public static void main(String[] args) {
        try {
            // Create a context
            Context ctx = new InitialContext();

            // Create a LinkRef
            LinkRef linkRef = new LinkRef("linkName", "atomicName");

            // Get the link name
            String linkName = linkRef.getLinkName();

            System.out.println("Link Name: " + linkName);

        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
