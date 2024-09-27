import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.ECPoint;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.PublicKey;

public class ECPublicKeySpec_2 {
    public static void main(String[] args) throws Exception {
        ECParameterSpec params = generateECParameterSpec();
        ECPublicKeySpec ecPublicKeySpec = new ECPublicKeySpec(new ECPoint(BigInteger.ONE, BigInteger.ONE), params);
        
        ECParameterSpec retrievedParams = ecPublicKeySpec.getParams();
        System.out.println("Retrieved EC Parameters: " + retrievedParams);
    }
    
    private static ECParameterSpec generateECParameterSpec() {
        EllipticCurve curve = new EllipticCurve(
            new BigInteger("1"),
            new BigInteger("1"),
            new BigInteger("1")
        );
        
        ECParameterSpec params = new ECParameterSpec(
            curve,
            new ECPoint(new BigInteger("1"), new BigInteger("1")),
            new BigInteger("1"),
            1
        );
        
        return params;
    }
}
