import javax.crypto.spec.PBEParameterSpec;

public class PBEParameterSpec_1 {
    public static void main(String[] args) {
        PBEParameterSpec pbeParamSpec = new PBEParameterSpec(new byte[]{1, 2, 3, 4, 5}, 20);
        int iterationCount = pbeParamSpec.getIterationCount();
        System.out.println("Iteration Count: " + iterationCount);
    }
}
