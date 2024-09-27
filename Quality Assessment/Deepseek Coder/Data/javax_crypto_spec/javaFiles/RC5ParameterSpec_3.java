import javax.crypto.spec.RC5ParameterSpec;

public class RC5ParameterSpec_3 {
    public static void main(String[] args) {
        RC5ParameterSpec spec = new RC5ParameterSpec(128, 12, 16);
        int rounds = spec.getRounds();
        System.out.println("Number of rounds: " + rounds);
    }
}
