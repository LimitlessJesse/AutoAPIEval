import java.security.spec.PSSParameterSpec;

public class PSSParameterSpec_4 {
    public static void main(String[] args) {
        PSSParameterSpec pssParameterSpec = new PSSParameterSpec("SHA-256", "MGF1", "SHA-1", 32, 1);
        String digestAlgorithm = pssParameterSpec.getDigestAlgorithm();
        System.out.println("Digest Algorithm: " + digestAlgorithm);
    }
}
