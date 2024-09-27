import javax.crypto.spec.GCMParameterSpec;

public class GCMParameterSpec_3 {
    public static void main(String[] args) {
        GCMParameterSpec spec = new GCMParameterSpec(128, new byte[16]);
        int tLen = spec.getTLen();
        System.out.println("Authentication tag length: " + tLen);
    }
}
