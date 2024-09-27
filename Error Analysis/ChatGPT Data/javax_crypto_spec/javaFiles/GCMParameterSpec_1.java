import javax.crypto.spec.GCMParameterSpec;

public class GCMParameterSpec_1 {
    public static void main(String[] args) {
        byte[] iv = new byte[12];
        byte[] tag = new byte[16];
        GCMParameterSpec gcmSpec = new GCMParameterSpec(128, iv, tag);
        
        int tagLength = gcmSpec.getTLen();
        System.out.println("Tag length: " + tagLength);
    }
}
