import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.EllipticCurve;

public class ECPrivateKeySpec_2 {
    public static void main(String[] args) {
        EllipticCurve curve = new EllipticCurve();
        ECParameterSpec params = new ECParameterSpec(curve, null, null, 0);
        ECPrivateKeySpec privateKeySpec = new ECPrivateKeySpec(null, params);
        
        ECParameterSpec domainParams = privateKeySpec.getParams();
        System.out.println("EC Domain Parameters: " + domainParams);
    }
}
