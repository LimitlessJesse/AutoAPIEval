import javax.crypto.spec.GCMParameterSpec;

public class GCMParameterSpec_4 {
    public static void main(String[] args) {
        GCMParameterSpec spec = new GCMParameterSpec(128, new byte[12]);
        int tLen = spec.getTLen();
        System.out.println("Tag Length: " + tLen);
    }
}
