import javax.crypto.spec.GCMParameterSpec;

public class GCMParameterSpec_1 {
    public static void main(String[] args) {
        GCMParameterSpec spec = new GCMParameterSpec(128, new byte[12]);
        int tagLength = spec.getTLen();
        System.out.println("Authentication tag length: " + tagLength);
    }
}
