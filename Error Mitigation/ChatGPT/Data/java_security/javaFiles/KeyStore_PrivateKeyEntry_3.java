import java.security.KeyStore;

public class KeyStore_PrivateKeyEntry_3 {
    public static void main(String[] args) {
        KeyStore.PrivateKeyEntry privateKeyEntry = new KeyStore.PrivateKeyEntry(null, null);
        System.out.println(privateKeyEntry.toString());
    }
}
