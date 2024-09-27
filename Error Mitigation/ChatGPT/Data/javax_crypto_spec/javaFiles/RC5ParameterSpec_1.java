import javax.crypto.spec.RC5ParameterSpec;

public class RC5ParameterSpec_1 {
    public static void main(String[] args) {
        RC5ParameterSpec rc5ParamSpec = new RC5ParameterSpec(16, 32, 12);
        int rounds = rc5ParamSpec.getRounds();
        System.out.println("Number of rounds: " + rounds);
    }
}
