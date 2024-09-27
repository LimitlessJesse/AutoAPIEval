import java.security.spec.PSSParameterSpec;

public class PSSParameterSpec_3 {
    public static void main(String[] args) {
        PSSParameterSpec pssParamSpec = new PSSParameterSpec("SHA-256", "MGF1", PSSParameterSpec.DEFAULT_MGF_DIGEST, PSSParameterSpec.DEFAULT_SALT_LENGTH, PSSParameterSpec.TRAILER_FIELD_BC);
        
        String mgfAlgorithm = pssParamSpec.getMGFAlgorithm();
        System.out.println("Mask Generation Function Algorithm: " + mgfAlgorithm);
    }
}
