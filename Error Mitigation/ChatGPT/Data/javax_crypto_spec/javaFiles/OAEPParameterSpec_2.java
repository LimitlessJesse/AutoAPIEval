import javax.crypto.spec.OAEPParameterSpec;

public class OAEPParameterSpec_2 {
    public static void main(String[] args) {
        OAEPParameterSpec oaepParamSpec = new OAEPParameterSpec("SHA-256", "MGF1", null, null);
        String mgfAlgorithm = oaepParamSpec.getMGFAlgorithm();
        System.out.println("Mask Generation Function Algorithm: " + mgfAlgorithm);
    }
}
