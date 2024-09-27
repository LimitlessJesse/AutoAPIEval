import org.ietf.jgss.GSSManager;
import org.ietf.jgss.Oid;

public class GSSManager_5 {
    public static void main(String[] args) {
        GSSManager gssManager = GSSManager.getInstance();
        Oid[] mechanisms = gssManager.getMechs();
        
        if (mechanisms != null) {
            for (Oid mechanism : mechanisms) {
                System.out.println(mechanism.toString());
            }
        } else {
            System.out.println("No mechanisms available");
        }
    }
}
