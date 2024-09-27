import javax.crypto.spec.PBEParameterSpec;

public class PBEParameterSpec_1 {
    public static void main(String[] args) {
        PBEParameterSpec pbeParamSpec = new PBEParameterSpec(new byte[]{1, 2, 3}, 1000);
        int iterationCount = pbeParamSpec.getIterationCount();
        System.out.println("Iteration Count: " + iterationCount);
    }
}
