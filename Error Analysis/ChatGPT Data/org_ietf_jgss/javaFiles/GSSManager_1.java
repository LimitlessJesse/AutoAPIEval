import org.ietf.jgss.*;
import java.security.Provider;

public class GSSManager_1 {
    public static void main(String[] args) {
        try {
            GSSManager manager = GSSManager.getInstance();
            GSSName peerName = manager.createName("peerName", GSSName.NT_HOSTBASED_SERVICE);
            Oid mech = new Oid("1.2.840.113554.1.2.2");
            GSSCredential myCred = manager.createCredential(null, GSSCredential.DEFAULT_LIFETIME, mech, GSSCredential.ACCEPT_ONLY);
            GSSContext context = manager.createContext(peerName, mech, myCred, GSSContext.DEFAULT_LIFETIME);
            
            // Use context for further operations
            
            System.out.println("GSSContext created successfully");
        } catch (GSSException e) {
            e.printStackTrace();
        }
    }
}
