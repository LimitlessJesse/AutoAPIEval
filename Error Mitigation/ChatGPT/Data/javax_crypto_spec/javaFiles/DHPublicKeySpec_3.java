import javax.crypto.spec.DHPublicKeySpec;
import java.math.BigInteger;

public class DHPublicKeySpec_3 {
    public static void main(String[] args) {
        DHPublicKeySpec dhPublicKeySpec = new DHPublicKeySpec(new BigInteger("1234567890"), new BigInteger("9876543210"), new BigInteger("12345"));
        BigInteger baseGenerator = dhPublicKeySpec.getG();
        System.out.println("Base generator g: " + baseGenerator);
    }
}
