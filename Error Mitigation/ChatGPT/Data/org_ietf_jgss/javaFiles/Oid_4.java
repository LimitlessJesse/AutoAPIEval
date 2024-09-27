import org.ietf.jgss.GSSException;
import org.ietf.jgss.Oid;

public class Oid_4 {
    public static void main(String[] args) {
        Oid oid = null; // Initialize Oid object with your desired OID value
        try {
            byte[] derEncoding = oid.getDER();
            // Use the DER encoding as needed
        } catch (GSSException e) {
            e.printStackTrace();
        }
    }
}
