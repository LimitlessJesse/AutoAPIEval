import java.math.BigInteger;
import java.security.spec.RSAKeyGenParameterSpec;

public class RSAKeyGenParameterSpec_2 {
    public static void main(String[] args) {
        RSAKeyGenParameterSpec spec = new RSAKeyGenParameterSpec(1024, BigInteger.valueOf(65537));
        BigInteger publicExponent = spec.getPublicExponent();
        System.out.println("Public Exponent: " + publicExponent);
    }
}
