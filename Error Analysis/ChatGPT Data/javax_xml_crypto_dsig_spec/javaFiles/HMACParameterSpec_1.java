import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class HMACParameterSpec_1 {
    public static void main(String[] args) {
        HMACParameterSpec hmacParameterSpec = new HMACParameterSpec(256);
        int outputLength = hmacParameterSpec.getOutputLength();
        System.out.println("Output Length: " + outputLength);
    }
}
