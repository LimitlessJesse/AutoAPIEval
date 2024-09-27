import javax.crypto.spec.OAEPParameterSpec;

public class OAEPParameterSpec_3 {
    public static void main(String[] args) {
        OAEPParameterSpec oaepParamSpec = new OAEPParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), PSource.PSpecified.DEFAULT);
        PSource pSource = oaepParamSpec.getPSource();
        System.out.println("PSource: " + pSource);
    }
}
