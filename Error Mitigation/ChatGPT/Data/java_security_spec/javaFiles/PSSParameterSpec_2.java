import java.security.spec.PSSParameterSpec;

public class PSSParameterSpec_2 {
    public static void main(String[] args) {
        PSSParameterSpec pssParamSpec = new PSSParameterSpec("SHA-256", "MGF1", PSSParameterSpec.DEFAULT.getSaltLength(), PSSParameterSpec.DEFAULT.getTrailerField());
        String digestAlgorithm = pssParamSpec.getDigestAlgorithm();
        System.out.println("Message digest algorithm: " + digestAlgorithm);
    }
}
