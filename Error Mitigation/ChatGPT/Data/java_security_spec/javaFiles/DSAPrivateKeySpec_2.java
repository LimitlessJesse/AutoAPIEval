import java.math.BigInteger;
import java.security.spec.DSAPrivateKeySpec;

public class DSAPrivateKeySpec_2 {
    public static void main(String[] args) {
        DSAPrivateKeySpec privateKeySpec = new DSAPrivateKeySpec(new BigInteger("1234567890"), new BigInteger("9876543210"), new BigInteger("1357924680"), new BigInteger("2468135790"));
        
        BigInteger primeP = privateKeySpec.getP();
        System.out.println("Prime p: " + primeP);
    }
}
