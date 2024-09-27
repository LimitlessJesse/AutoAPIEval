import javax.crypto.spec.OAEPParameterSpec;

public class OAEPParameterSpec_2 {
    public static void main(String[] args) {
        OAEPParameterSpec oaepParameterSpec = new OAEPParameterSpec("MGF1", "SHA-256");
        String mgfAlgorithm = oaepParameterSpec.getMGFAlgorithm();
        System.out.println("Mask Generation Function Algorithm: " + mgfAlgorithm);
    }
}
