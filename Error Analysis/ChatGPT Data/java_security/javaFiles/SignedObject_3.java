import java.security.*;

public class SignedObject_3 {
    public static void main(String[] args) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            KeyPair keyPair = keyPairGenerator.generateKeyPair();

            String data = "Hello, World!";
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(keyPair.getPrivate());
            signature.update(data.getBytes());
            byte[] signedData = signature.sign();

            SignedObject signedObject = new SignedObject(data, keyPair.getPrivate(), signature);
            boolean isValid = signedObject.verify(keyPair.getPublic(), signature);

            System.out.println("Is signature valid: " + isValid);
        } catch (NoSuchAlgorithmException | InvalidKeyException | SignatureException | InvalidObjectException e) {
            e.printStackTrace();
        }
    }
}
