import javax.crypto.spec.PBEKeySpec;

public class PBEKeySpec_3 {
    public static void main(String[] args) {
        PBEKeySpec keySpec = new PBEKeySpec("password".toCharArray());
        int iterationCount = keySpec.getIterationCount();
        System.out.println("Iteration Count: " + iterationCount);
    }
}
