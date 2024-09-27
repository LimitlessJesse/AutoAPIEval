import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

public class ECPublicKeySpec_1 {
    public static void main(String[] args) {
        // Create an instance of ECPublicKeySpec
        ECPoint point = new ECPoint(1, 2);
        ECPublicKeySpec publicKeySpec = new ECPublicKeySpec(point, null);
        
        // Get the public point W using getW() method
        ECPoint publicPoint = publicKeySpec.getW();
        
        // Print the public point W
        System.out.println("Public Point W: " + publicPoint);
    }
}
