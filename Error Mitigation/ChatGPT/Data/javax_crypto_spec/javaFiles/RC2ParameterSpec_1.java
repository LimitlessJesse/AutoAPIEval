import javax.crypto.spec.RC2ParameterSpec;

public class RC2ParameterSpec_1 {
    public static void main(String[] args) {
        RC2ParameterSpec rc2ParamSpec = new RC2ParameterSpec(128, 0);
        int effectiveKeyBits = rc2ParamSpec.getEffectiveKeyBits();
        System.out.println("Effective Key Bits: " + effectiveKeyBits);
    }
}
