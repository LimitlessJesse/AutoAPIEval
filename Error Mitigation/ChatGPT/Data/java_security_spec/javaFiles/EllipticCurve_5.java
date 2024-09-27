import java.security.spec.ECField;
import java.security.spec.EllipticCurve;

public class EllipticCurve_5 {
    public static void main(String[] args) {
        ECField field = new ECField(10);
        EllipticCurve curve1 = new EllipticCurve(field, 5, 7);
        EllipticCurve curve2 = new EllipticCurve(field, 5, 7);

        boolean result = curve1.equals(curve2);
        System.out.println("Are the curves equal? " + result);
    }
}
