import javax.crypto.spec.RC2ParameterSpec;

public class RC2ParameterSpec_1 {
    public static void main(String[] args) {
        RC2ParameterSpec rc2Spec = new RC2ParameterSpec(128, 8); // Example values for key size and effective key bits
        int effectiveKeyBits = rc2Spec.getEffectiveKeyBits();
        System.out.println("Effective Key Bits: " + effectiveKeyBits);
    }
}
