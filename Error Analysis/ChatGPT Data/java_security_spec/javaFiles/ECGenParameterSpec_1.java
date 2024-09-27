import java.security.spec.ECGenParameterSpec;

public class ECGenParameterSpec_1 {
    public static void main(String[] args) {
        ECGenParameterSpec ecGenParameterSpec = new ECGenParameterSpec("secp256r1");
        String name = ecGenParameterSpec.getName();
        System.out.println("ECGenParameterSpec Name: " + name);
    }
}
