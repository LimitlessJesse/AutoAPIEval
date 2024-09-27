import java.security.KeyStore;
import java.util.Enumeration;

public class KeyStore_2 {
    public static void main(String[] args) {
        try {
            KeyStore keyStore = KeyStore.getInstance("JKS");
            keyStore.load(null, null);
            
            Enumeration<String> aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                String alias = aliases.nextElement();
                System.out.println("Alias: " + alias);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
