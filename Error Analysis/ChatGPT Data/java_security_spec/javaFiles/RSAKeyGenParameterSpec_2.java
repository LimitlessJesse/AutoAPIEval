import java.security.spec.RSAKeyGenParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import java.math.BigInteger;

public class RSAKeyGenParameterSpec_2 {
    public static void main(String[] args) {
        RSAKeyGenParameterSpec spec = new RSAKeyGenParameterSpec(1024, BigInteger.valueOf(65537));
        System.out.println("Public Exponent: " + spec.getPublicExponent());
    }
}
