import javax.naming.LinkRef;
import javax.naming.NamingException;

public class LinkRef_1 {
    public static void main(String[] args) {
        LinkRef linkRef = new LinkRef("exampleLink");
        
        try {
            String linkName = linkRef.getLinkName();
            System.out.println("Link name: " + linkName);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
