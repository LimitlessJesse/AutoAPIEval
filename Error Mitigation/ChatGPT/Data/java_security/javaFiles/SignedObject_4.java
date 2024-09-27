import java.security.SignedObject;

public class SignedObject_4 {
    public static void main(String[] args) {
        SignedObject signedObject = new SignedObject();
        String algorithm = signedObject.getAlgorithm();
        System.out.println("Signature Algorithm: " + algorithm);
    }
}
