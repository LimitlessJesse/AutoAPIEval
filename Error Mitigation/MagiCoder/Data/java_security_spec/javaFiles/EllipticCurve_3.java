import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.EllipticCurve;

public class EllipticCurve_3 {
    public static void main(String[] args) {
        BigInteger p = new BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853951");
        BigInteger a = new BigInteger("-3");
        BigInteger b = new BigInteger("10103326366193004185693434368906803479063449003438986563936156996688810195374");
        ECFieldFp field = new ECFieldFp(p);
        EllipticCurve curve = new EllipticCurve(field, a, b);
        BigInteger bValue = curve.getB();
        System.out.println("The value of b is: " + bValue);
    }
}
