import javax.crypto.spec.GCMParameterSpec;

public class GCMParameterSpec_3 {
    public static void main(String[] args) {
        GCMParameterSpec gcmSpec = new GCMParameterSpec(128, new byte[12]);
        int tLen = gcmSpec.getTLen();
        System.out.println("Tag Length: " + tLen);
    }
}
