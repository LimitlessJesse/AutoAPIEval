import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;

public class DHParameterSpec_2 {
    public static void main(String[] args) {
        // Create a DHParameterSpec
        DHParameterSpec dhParameterSpec = new DHParameterSpec(
            new BigInteger("1024"), // p
            new BigInteger("8"), // g
            null, // l
            null // j
        );

        // Get the BigInteger p from the DHParameterSpec
        BigInteger p = dhParameterSpec.getP();

        // Print the value of p
        System.out.println("The value of p is: " + p);
    }
}
