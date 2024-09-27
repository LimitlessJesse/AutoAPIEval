import java.security.spec.PSSParameterSpec;

public class PSSParameterSpec_5 {
    public static void main(String[] args) {
        PSSParameterSpec pssParamSpec = new PSSParameterSpec("SHA-256", "MGF1", "MGF1ParameterSpec.SHA-256", 32, 1);
        AlgorithmParameterSpec mgfParams = pssParamSpec.getMGFParameters();
        System.out.println("Mask Generation Function Parameters: " + mgfParams);
    }
}
