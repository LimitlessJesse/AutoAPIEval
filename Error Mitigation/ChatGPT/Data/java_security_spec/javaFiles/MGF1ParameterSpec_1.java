import java.security.spec.MGF1ParameterSpec;

public class MGF1ParameterSpec_1 {
    public static void main(String[] args) {
        MGF1ParameterSpec spec = new MGF1ParameterSpec("SHA-256");
        String digestAlgorithm = spec.getDigestAlgorithm();
        System.out.println("Message digest algorithm: " + digestAlgorithm);
    }
}
