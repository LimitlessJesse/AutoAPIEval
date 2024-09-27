import javax.crypto.spec.RC5ParameterSpec;

public class RC5ParameterSpec_2 {
    public static void main(String[] args) {
        RC5ParameterSpec spec = new RC5ParameterSpec(10, 16, 12);
        int rounds = spec.getRounds();
        System.out.println("Number of rounds: " + rounds);
    }
}
