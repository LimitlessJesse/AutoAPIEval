import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;

public class DHParameterSpec_3 {
    public static void main(String[] args) {
        // Create a DHParameterSpec
        DHParameterSpec dhParameterSpec = new DHParameterSpec(
            new BigInteger("1024"), // p
            new BigInteger("8"), // g
            new BigInteger("100"), // q
            new BigInteger("2") // j
        );

        // Get the value of g from the DHParameterSpec
        BigInteger g = dhParameterSpec.getG();

        // Print the value of g
        System.out.println("The value of g is: " + g);
    }
}
