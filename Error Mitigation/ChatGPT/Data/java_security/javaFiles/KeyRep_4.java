import java.io.ObjectStreamException;
import java.security.Key;
import java.security.KeyRep;
import javax.crypto.spec.SecretKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.KeyFactory;

public class KeyRep_4 {
    public static void main(String[] args) {
        Key key = new KeyRep(KeyRep.Type.SECRET, "RAW", new byte[]{1, 2, 3}, "AES");
        try {
            Object resolvedKey = key.readResolve();
            System.out.println("Resolved Key: " + resolvedKey);
        } catch (ObjectStreamException e) {
            System.out.println("Error resolving key: " + e.getMessage());
        }
    }
}
