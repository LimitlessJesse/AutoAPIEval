import javax.crypto.spec.PBEParameterSpec;

public class PBEParameterSpec_3 {
    public static void main(String[] args) {
        PBEParameterSpec spec = new PBEParameterSpec(new byte[8], 10);
        int iterationCount = spec.getIterationCount();
        System.out.println("Iteration count: " + iterationCount);
    }
}
