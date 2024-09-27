import java.security.spec.EllipticCurve;

public class EllipticCurve_5 {
    public static void main(String[] args) {
        EllipticCurve curve = new EllipticCurve(null, null, null);
        byte[] seed = curve.getSeed();
        System.out.println("Seed: " + new String(seed));
    }
}
