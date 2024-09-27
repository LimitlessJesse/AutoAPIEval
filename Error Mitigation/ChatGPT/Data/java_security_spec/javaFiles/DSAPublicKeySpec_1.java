import java.math.BigInteger;
import java.security.spec.DSAPublicKeySpec;

public class DSAPublicKeySpec_1 {
    public static void main(String[] args) {
        DSAPublicKeySpec dsaPublicKeySpec = new DSAPublicKeySpec(new BigInteger("1234567890"), new BigInteger("9876543210"), new BigInteger("1357924680"), new BigInteger("2468135790"));
        BigInteger publicKeyY = dsaPublicKeySpec.getY();
        System.out.println("Public Key Y: " + publicKeyY);
    }
}
