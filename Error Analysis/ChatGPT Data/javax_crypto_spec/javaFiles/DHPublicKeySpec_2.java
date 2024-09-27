import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

public class DHPublicKeySpec_2 {
    public static void main(String[] args) {
        // Creating a DHParameterSpec object
        BigInteger p = new BigInteger("1234567890");
        BigInteger g = new BigInteger("2");
        DHParameterSpec dhParamSpec = new DHParameterSpec(p, g);
        
        // Creating a DHPublicKeySpec object
        BigInteger y = new BigInteger("987654321");
        DHPublicKeySpec dhPublicKeySpec = new DHPublicKeySpec(y, dhParamSpec);
        
        // Getting the value of g from DHPublicKeySpec
        BigInteger gValue = dhPublicKeySpec.getG();
        
        System.out.println("Value of g: " + gValue);
    }
}
