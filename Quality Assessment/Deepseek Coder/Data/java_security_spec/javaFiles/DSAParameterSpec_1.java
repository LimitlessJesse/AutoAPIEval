import java.math.BigInteger;
import java.security.spec.DSAParameterSpec;

public class DSAParameterSpec_1 {
    public static void main(String[] args) {
        BigInteger p = BigInteger.probablePrime(512, new java.util.Random());
        BigInteger q = BigInteger.probablePrime(512, new java.util.Random());
        BigInteger g = BigInteger.probablePrime(512, new java.util.Random());

        DSAParameterSpec params = new DSAParameterSpec(p, q, g);

        System.out.println("P: " + params.getP());
    }
}
