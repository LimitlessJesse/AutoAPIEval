import org.ietf.jgss.GSSException;
import org.ietf.jgss.GSSManager;
import org.ietf.jgss.GSSName;
import org.ietf.jgss.Oid;

public class GSSManager_1 {
    public static void main(String[] args) {
        GSSManager manager = GSSManager.getInstance();
        try {
            GSSName gssName = manager.createName("exampleName", Oid.getDefault());
            System.out.println("GSSName created: " + gssName.toString());
        } catch (GSSException e) {
            e.printStackTrace();
        }
    }
}
