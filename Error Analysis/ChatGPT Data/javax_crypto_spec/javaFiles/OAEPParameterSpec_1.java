import javax.crypto.spec.OAEPParameterSpec;

public class OAEPParameterSpec_1 {
    public static void main(String[] args) {
        OAEPParameterSpec spec = new OAEPParameterSpec("SHA-256", "MGF1", null, null);
        String mgfAlgorithm = spec.getMGFAlgorithm();
        System.out.println("MGF Algorithm: " + mgfAlgorithm);
    }
}
