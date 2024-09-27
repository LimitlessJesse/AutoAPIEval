import javax.crypto.spec.DHGenParameterSpec;

public class DHGenParameterSpec_5 {
    public static void main(String[] args) {
        DHGenParameterSpec dhGenParameterSpec = new DHGenParameterSpec(1024, 160);
        int exponentSize = dhGenParameterSpec.getExponentSize();
        System.out.println("Exponent Size: " + exponentSize);
    }
}
