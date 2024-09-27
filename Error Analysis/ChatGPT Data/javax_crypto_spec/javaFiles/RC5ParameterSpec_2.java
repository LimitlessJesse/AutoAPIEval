import javax.crypto.spec.RC5ParameterSpec;

public class RC5ParameterSpec_2 {
    public static void main(String[] args) {
        RC5ParameterSpec rc5 = new RC5ParameterSpec(16, 32, 8);
        int rounds = rc5.getRounds();
        System.out.println("Number of rounds: " + rounds);
    }
}
