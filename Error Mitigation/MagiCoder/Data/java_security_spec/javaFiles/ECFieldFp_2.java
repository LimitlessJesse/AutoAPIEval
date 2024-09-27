import java.math.BigInteger;
import java.security.spec.ECFieldFp;

public class ECFieldFp_2 {
    public static void main(String[] args) {
        BigInteger p = BigInteger.valueOf(17);
        ECFieldFp ecFieldFp = new ECFieldFp(p);
        BigInteger result = ecFieldFp.getP();
        System.out.println("The prime p of this prime finite field is: " + result);
    }
}
