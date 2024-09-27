import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Key;
import java.security.PublicKey;

public class KeyInfoFactory_1 {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        Key publicKey = keyPair.getPublic();

        KeyInfoFactory keyInfoFactory = KeyInfoFactory.getInstance();
        KeyValue keyValue = keyInfoFactory.newKeyValue((PublicKey) publicKey);

        System.out.println("KeyValue created successfully: " + keyValue.toString());
    }
}
