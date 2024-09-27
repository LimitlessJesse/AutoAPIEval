import javax.crypto.spec.DHParameterSpec;

public class DHParameterSpec_3 {
    public static void main(String[] args) {
        DHParameterSpec dhParamSpec = new DHParameterSpec(1024, 5);
        int L = dhParamSpec.getL();
        System.out.println("L value: " + L);
    }
}
