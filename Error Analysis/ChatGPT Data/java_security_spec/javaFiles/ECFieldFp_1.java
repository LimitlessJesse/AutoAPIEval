import java.math.BigInteger;
import java.security.spec.ECFieldFp;

public class ECFieldFp_1 {
    public static void main(String[] args) {
        ECFieldFp ecField = new ECFieldFp(new BigInteger("13"));
        BigInteger prime = ecField.getP();
        System.out.println("Prime value: " + prime);
    }
}
