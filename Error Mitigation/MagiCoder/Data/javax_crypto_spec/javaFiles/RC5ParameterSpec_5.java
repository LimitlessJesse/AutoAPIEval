import javax.crypto.spec.RC5ParameterSpec;

public class RC5ParameterSpec_5 {
    public static void main(String[] args) {
        RC5ParameterSpec spec1 = new RC5ParameterSpec(1, 1, 1, new byte[0]);
        RC5ParameterSpec spec2 = new RC5ParameterSpec(1, 1, 1, new byte[0]);
        RC5ParameterSpec spec3 = new RC5ParameterSpec(2, 2, 2, new byte[0]);

        System.out.println(spec1.equals(spec2));  // true
        System.out.println(spec1.equals(spec3));  // false
        System.out.println(spec1.equals(null));   // false
    }
}
