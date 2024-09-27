import java.math.BigInteger;
import java.security.spec.DSAPublicKeySpec;

public class DSAPublicKeySpec_1 {
    public static void main(String[] args) {
        // Create a DSAPublicKeySpec object
        BigInteger y = getPublicKeyY(new DSAPublicKeySpec(BigInteger.ONE, BigInteger.TEN, BigInteger.ZERO, BigInteger.ZERO));
        
        // Print the value of y
        System.out.println("Y value: " + y);
    }

    public static BigInteger getPublicKeyY(DSAPublicKeySpec keySpec) {
        return keySpec.getY();
    }
}
