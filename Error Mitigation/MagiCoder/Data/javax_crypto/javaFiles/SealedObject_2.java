import javax.crypto.Cipher;
import javax.crypto.SealedObject;
import java.io.IOException;
import java.io.Serializable;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Base64;

public class SealedObject_2 {
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, IOException, ClassNotFoundException {
        // Create a Cipher
        Cipher cipher = Cipher.getInstance("AES");

        // Create a SealedObject
        SealedObject sealedObject = new SealedObject(new MyObject(), cipher);

        // Get the original object
        Object originalObject = sealedObject.getObject(cipher);

        System.out.println(originalObject);
    }
}

class MyObject implements Serializable {
    private String data = "Hello, World!";

    @Override
    public String toString() {
        return data;
    }
}
