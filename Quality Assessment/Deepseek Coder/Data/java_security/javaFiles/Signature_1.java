import java.security.Signature;
import java.security.PublicKey;
import java.security.KeyPairGenerator;
import java.security.KeyPair;

public class Signature_1 {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(1024);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();

        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initVerify(publicKey);

        String data = "Hello, World!";
        byte[] bytes = data.getBytes();

        signature.update(bytes);

        boolean verified = signature.verify(bytes);

        System.out.println("Verified: " + verified);
    }
}
