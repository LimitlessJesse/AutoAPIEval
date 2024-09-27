import java.math.BigInteger;
import java.security.spec.ECPrivateKeySpec;

public class ECPrivateKeySpec_1 {
    public static void main(String[] args) {
        // Create an example ECPrivateKeySpec
        BigInteger s = new BigInteger("1234567890");
        ECPrivateKeySpec privateKeySpec = new ECPrivateKeySpec(s, null);
        
        // Get the private value S using getS() method
        BigInteger privateValueS = privateKeySpec.getS();
        
        // Print the private value S
        System.out.println("Private value S: " + privateValueS);
    }
}
