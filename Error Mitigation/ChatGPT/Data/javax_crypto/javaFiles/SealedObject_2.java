import javax.crypto.SealedObject;
import javax.crypto.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import java.security.Key;
import java.io.IOException;
import java.io.Serializable;
import java.security.InvalidKeyException;
import java.io.ObjectInputStream;
import java.io.ByteArrayInputStream;

public class SealedObject_2 {
    public static void main(String[] args) {
        try {
            // Assume sealedObject is the SealedObject instance you want to unseal
            SealedObject sealedObject = new SealedObject(new Object(), Cipher.getInstance("AES"));
            Key key = null; // Provide the key used for sealing the object

            Object unsealedObject = getObject(sealedObject, key);
            System.out.println("Unsealed object: " + unsealedObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Object getObject(SealedObject sealedObject, Key key) throws IOException, ClassNotFoundException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(sealedObject.getAlgorithm());
        cipher.init(Cipher.DECRYPT_MODE, key);

        byte[] encryptedData = sealedObject.getEncryptedContent();
        byte[] decryptedData = cipher.doFinal(encryptedData);

        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(decryptedData))) {
            return ois.readObject();
        }
    }
}
