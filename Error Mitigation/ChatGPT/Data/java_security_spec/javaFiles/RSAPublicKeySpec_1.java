import java.math.BigInteger;
import java.security.spec.RSAPublicKeySpec;

public class RSAPublicKeySpec_1 {
    public static void main(String[] args) {
        RSAPublicKeySpec publicKeySpec = new RSAPublicKeySpec(new BigInteger("1234567890"), new BigInteger("65537"));
        BigInteger modulus = publicKeySpec.getModulus();
        System.out.println("Modulus: " + modulus);
    }
}
