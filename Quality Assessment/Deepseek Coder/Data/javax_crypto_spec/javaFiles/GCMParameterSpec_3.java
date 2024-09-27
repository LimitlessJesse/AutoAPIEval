import javax.crypto.spec.GCMParameterSpec;

public class GCMParameterSpec_3 {
    public static void main(String[] args) {
        int tLen = 128; // example value
        GCMParameterSpec spec = new GCMParameterSpec(tLen, new byte[12]); // example iv
        System.out.println(spec.getTLen());
    }
}
