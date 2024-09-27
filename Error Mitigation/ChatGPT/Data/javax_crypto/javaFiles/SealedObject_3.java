import javax.crypto.SealedObject;

public class SealedObject_3 {
    public static void main(String[] args) {
        SealedObject sealedObject = new SealedObject("Hello", null);
        String algorithm = sealedObject.getAlgorithm();
        System.out.println("Algorithm used: " + algorithm);
    }
}
