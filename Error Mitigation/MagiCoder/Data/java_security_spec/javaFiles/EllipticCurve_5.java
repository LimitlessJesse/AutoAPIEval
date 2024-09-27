import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.EllipticCurve;

public class EllipticCurve_5 {
    public static void main(String[] args) {
        BigInteger p = new BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853951");
        BigInteger a = new BigInteger("-3");
        BigInteger b = new BigInteger("10103326366193004185693434363065092880406679486764017719318330498997934416883");
        ECFieldFp field = new ECFieldFp(p);
        EllipticCurve curve = new EllipticCurve(field, a, b);

        BigInteger p2 = new BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853951");
        BigInteger a2 = new BigInteger("-3");
        BigInteger b2 = new BigInteger("10103326366193004185693434363065092880406679486764017719318330498997934416883");
        ECFieldFp field2 = new ECFieldFp(p2);
        EllipticCurve curve2 = new EllipticCurve(field2, a2, b2);

        System.out.println(curve.equals(curve2));
    }
}
