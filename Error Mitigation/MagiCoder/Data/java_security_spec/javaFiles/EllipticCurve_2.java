import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.EllipticCurve;

public class EllipticCurve_2 {
    public static void main(String[] args) {
        // Create an instance of EllipticCurve
        BigInteger p = new BigInteger("17");
        ECFieldFp field = new ECFieldFp(p);
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("2");
        EllipticCurve curve = new EllipticCurve(field, a, b);

        // Get the value of a
        BigInteger aValue = curve.getA();
        System.out.println("The value of a is: " + aValue);
    }
}
