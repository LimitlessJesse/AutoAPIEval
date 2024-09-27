import javax.crypto.spec.RC2ParameterSpec;

public class RC2ParameterSpec_6 {
    public static void main(String[] args) {
        RC2ParameterSpec rc2ParameterSpec = new RC2ParameterSpec(128, 123456789);
        int hashCode = rc2ParameterSpec.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
