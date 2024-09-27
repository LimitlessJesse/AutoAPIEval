import javax.crypto.spec.RC5ParameterSpec;

public class RC5ParameterSpec_2 {
    public static void main(String[] args) {
        RC5ParameterSpec rc5ParamSpec = new RC5ParameterSpec(16, 32, 8);
        int wordSize = rc5ParamSpec.getWordSize();
        System.out.println("Word size: " + wordSize);
    }
}
