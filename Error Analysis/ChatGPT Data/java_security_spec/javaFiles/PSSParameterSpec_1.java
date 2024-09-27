import java.security.spec.PSSParameterSpec;

public class PSSParameterSpec_1 {
    public static void main(String[] args) {
        PSSParameterSpec pssParameterSpec = new PSSParameterSpec.Builder().getSaltLength();
        System.out.println("Salt Length: " + pssParameterSpec.getSaltLength());
    }
}
