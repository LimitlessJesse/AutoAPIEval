import java.security.*;

public class Signature_4 {
    public static void main(String[] args) {
        try {
            KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
            KeyPair keyPair = keyPairGen.generateKeyPair();

            Signature signature = Signature.getInstance("SHA256withRSA");
            PrivateKey privateKey = keyPair.getPrivate();
            signature.initSign(privateKey);

            // Perform signing operations using this signature object
            // ...
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
