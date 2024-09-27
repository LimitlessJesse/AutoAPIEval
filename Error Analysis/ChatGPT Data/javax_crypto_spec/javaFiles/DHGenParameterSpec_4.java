import javax.crypto.spec.DHGenParameterSpec;

public class DHGenParameterSpec_4 {
    public static void main(String[] args) {
        DHGenParameterSpec spec = new DHGenParameterSpec(2048, 256);
        int exponentSize = spec.getExponentSize();
        System.out.println("Exponent size: " + exponentSize);
    }
}
