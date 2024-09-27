import java.math.BigInteger;
import java.security.spec.EllipticCurve;

public class EllipticCurve_2 {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(2);
        EllipticCurve ec = new EllipticCurve(a, b);

        BigInteger bValue = ec.getB();
        System.out.println("The value of b is: " + bValue);
    }
}
