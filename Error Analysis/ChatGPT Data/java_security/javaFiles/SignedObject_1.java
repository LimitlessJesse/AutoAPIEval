import java.io.Serializable;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignedObject;

public class SignedObject_1 {
    public static void main(String[] args) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            PrivateKey privateKey = keyPair.getPrivate();
            PublicKey publicKey = keyPair.getPublic();

            Serializable objectToSign = "Hello, World!";
            SignedObject signedObject = new SignedObject(objectToSign, privateKey, null);

            Serializable signedObjectData = signedObject.getObject(publicKey);
            System.out.println("Signed object data: " + signedObjectData);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
