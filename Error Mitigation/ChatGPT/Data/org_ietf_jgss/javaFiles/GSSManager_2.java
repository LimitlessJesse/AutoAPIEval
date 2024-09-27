import org.ietf.jgss.GSSManager;
import org.ietf.jgss.GSSName;
import org.ietf.jgss.GSSCredential;
import org.ietf.jgss.Oid;
import org.ietf.jgss.GSSException;

public class GSSManager_2 {
    public static void main(String[] args) {
        GSSManager manager = GSSManager.getInstance();
        GSSName desiredName = null; // specify the desired GSSName
        int lifetime = GSSCredential.INDEFINITE_LIFETIME; // specify the desired lifetime
        Oid[] mechanism = null; // specify the desired mechanism
        int usage = GSSCredential.INITIATE_AND_ACCEPT; // specify the desired usage
        
        try {
            GSSCredential credential = manager.createCredential(desiredName, lifetime, mechanism, usage);
            // make use of the created GSSCredential object
        } catch (GSSException e) {
            e.printStackTrace();
        }
    }
}
