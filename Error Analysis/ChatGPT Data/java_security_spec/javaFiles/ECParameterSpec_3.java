import java.security.spec.ECParameterSpec;
import java.security.spec.EllipticCurve;

public class ECParameterSpec_3 {
    public static void main(String[] args) {
        EllipticCurve curve = new EllipticCurve(null, null, null);
        ECParameterSpec ecParamSpec = new ECParameterSpec(curve, null, null, 1); // Create an ECParameterSpec object
        int cofactor = ecParamSpec.getCofactor(); // Get the cofactor value
        System.out.println("Cofactor: " + cofactor);
    }
}
