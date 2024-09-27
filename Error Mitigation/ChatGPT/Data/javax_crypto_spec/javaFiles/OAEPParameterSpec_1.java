import javax.crypto.spec.OAEPParameterSpec;

public class OAEPParameterSpec_1 {
    public static void main(String[] args) {
        OAEPParameterSpec oaepParamSpec = new OAEPParameterSpec("SHA-256", "MGF1", null, null);
        String digestAlgorithm = oaepParamSpec.getDigestAlgorithm();
        System.out.println("Message digest algorithm: " + digestAlgorithm);
    }
}
