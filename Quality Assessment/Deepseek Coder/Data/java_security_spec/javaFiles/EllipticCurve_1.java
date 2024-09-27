import java.math.BigInteger;
import java.security.spec.EllipticCurve;

public class EllipticCurve_1 {
    public static void main(String[] args) {
        BigInteger p = new BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853951");
        BigInteger a = new BigInteger("-3");
        BigInteger b = new BigInteger("1017530667355405220384630030025845323978000861986495076670751504802684620157");
        EllipticCurve ellipticCurve = new EllipticCurve(a, b, p);
        BigInteger aFromCurve = ellipticCurve.getA();
        System.out.println("The 'a' parameter of the elliptic curve is: " + aFromCurve);
    }
}
