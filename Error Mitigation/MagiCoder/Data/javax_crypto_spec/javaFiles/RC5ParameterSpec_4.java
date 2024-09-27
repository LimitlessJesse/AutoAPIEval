import javax.crypto.spec.RC5ParameterSpec;

public class RC5ParameterSpec_4 {
    public static void main(String[] args) {
        RC5ParameterSpec spec = new RC5ParameterSpec(10, 16, 32);
        int hashCode = spec.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
