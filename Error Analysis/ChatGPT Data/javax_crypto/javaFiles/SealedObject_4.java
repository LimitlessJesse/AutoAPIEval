import javax.crypto.SealedObject;

public class SealedObject_4 {
    public static void main(String[] args) {
        // Creating a SealedObject
        SealedObject sealedObject = new SealedObject("Hello", null);

        // Getting the algorithm used to seal the object
        String algorithm = sealedObject.getAlgorithm();

        System.out.println("SealedObject algorithm: " + algorithm);
    }
}
