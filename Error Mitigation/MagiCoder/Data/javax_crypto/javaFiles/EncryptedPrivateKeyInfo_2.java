import javax.crypto.EncryptedPrivateKeyInfo;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;

public class EncryptedPrivateKeyInfo_2 {
    public static void main(String[] args) throws Exception {
        // Generate a key pair
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(1024);
        KeyPair pair = keyGen.generateKeyPair();
        PrivateKey privateKey = pair.getPrivate();

        // Convert the private key to EncryptedPrivateKeyInfo
        EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo(privateKey.getEncoded());

        // Get the encoded form of the EncryptedPrivateKeyInfo
        byte[] encoded = encryptedPrivateKeyInfo.getEncoded();

        // Print the encoded form
        for (byte b : encoded) {
            System.out.print(b + " ");
        }
    }
}
