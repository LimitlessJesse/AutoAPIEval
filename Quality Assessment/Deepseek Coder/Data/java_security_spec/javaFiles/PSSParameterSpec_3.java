import java.security.spec.PSSParameterSpec;

public class PSSParameterSpec_3 {
    public static void main(String[] args) {
        PSSParameterSpec spec = new PSSParameterSpec(1024, 128);
        int saltLength = spec.getSaltLength();
        System.out.println("Salt Length: " + saltLength);
    }
}
