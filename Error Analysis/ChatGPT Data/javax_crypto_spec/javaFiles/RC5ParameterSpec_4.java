import javax.crypto.spec.RC5ParameterSpec;

public class RC5ParameterSpec_4 {
    public static void main(String[] args) {
        RC5ParameterSpec rc5ParamSpec = new RC5ParameterSpec(12, 16, 8);
        int version = rc5ParamSpec.getVersion();
        System.out.println("RC5ParameterSpec version: " + version);
    }
}
