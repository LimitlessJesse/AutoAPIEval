import java.security.spec.PSSParameterSpec;

public class PSSParameterSpec_1 {
    public static void main(String[] args) {
        PSSParameterSpec pssParamSpec = new PSSParameterSpec(20);
        int saltLength = pssParamSpec.getSaltLength();
        System.out.println("Salt Length: " + saltLength);
    }
}
