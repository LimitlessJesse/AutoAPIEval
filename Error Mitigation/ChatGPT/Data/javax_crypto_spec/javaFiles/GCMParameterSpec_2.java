import javax.crypto.spec.GCMParameterSpec;

public class GCMParameterSpec_2 {
    public static void main(String[] args) {
        byte[] iv = new byte[12]; // IV length is typically 12 bytes
        GCMParameterSpec gcmParamSpec = new GCMParameterSpec(128, iv);
        
        byte[] returnedIV = gcmParamSpec.getIV();
        System.out.println("Returned IV: " + returnedIV);
    }
}
