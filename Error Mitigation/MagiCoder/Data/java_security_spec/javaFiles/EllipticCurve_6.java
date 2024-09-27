import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

public class EllipticCurve_6 {
    public static void main(String[] args) {
        BigInteger p = new BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853951");
        BigInteger a = new BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853948");
        BigInteger b = new BigInteger("41058363725152142129326129780047268409114441015993725554835256314039467401291");
        ECFieldFp field = new ECFieldFp(p);
        ECPoint point = new ECPoint(new BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853948"), new BigInteger("41058363725152142129326129780047268409114441015993725554835256314039467401291"));
        ECParameterSpec spec = new ECParameterSpec(field, point, new BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853948"), 1, new BigInteger("41058363725152142129326129780047268409114441015993725554835256314039467401291"));
        EllipticCurve curve = new EllipticCurve(spec);
        System.out.println(curve.hashCode());
    }
}
