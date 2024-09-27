import javax.crypto.spec.DHParameterSpec;

public class DHParameterSpec_3 {
    public static void main(String[] args) {
        DHParameterSpec dhParamSpec = new DHParameterSpec(1024, 160);
        int l = dhParamSpec.getL();
        System.out.println("Size of random exponent (private value): " + l);
    }
}
