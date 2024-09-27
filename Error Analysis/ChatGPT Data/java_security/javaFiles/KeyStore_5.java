import java.io.FileInputStream;
import java.security.Key;
import java.security.KeyStore;

public class KeyStore_5 {
    public static void main(String[] args) {
        try {
            KeyStore keyStore = KeyStore.getInstance("JKS");
            char[] password = "keystorepassword".toCharArray();
            FileInputStream fis = new FileInputStream("keystore.jks");
            keyStore.load(fis, password);

            String alias = "keyalias";
            Key key = keyStore.getKey(alias, password);
            
            System.out.println("Key retrieved successfully: " + key.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
