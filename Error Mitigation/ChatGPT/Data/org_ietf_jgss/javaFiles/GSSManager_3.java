import org.ietf.jgss.*;

public class GSSManager_3 {
    public static void main(String[] args) {
        GSSManager manager = GSSManager.getInstance();
        
        try {
            GSSName peer = manager.createName("peerName", null);
            Oid mech = null; // Use null to request the default mechanism
            GSSCredential myCred = null; // Use null to act as the default initiator principal
            int lifetime = GSSContext.DEFAULT_LIFETIME; // Use GSSContext.DEFAULT_LIFETIME for default lifetime
            
            GSSContext context = manager.createContext(peer, mech, myCred, lifetime);
            
            // Use the context for further operations
            
        } catch (GSSException e) {
            e.printStackTrace();
        }
    }
}
