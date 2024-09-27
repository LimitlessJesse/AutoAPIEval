import javax.crypto.spec.PBEKeySpec;

public class PBEKeySpec_3 {
    public static void main(String[] args) {
        // Create a PBEKeySpec object
        PBEKeySpec pbeKeySpec = new PBEKeySpec("password".toCharArray());

        // Get the iteration count
        int iterationCount = pbeKeySpec.getIterationCount();

        // Print the iteration count
        System.out.println("Iteration count: " + iterationCount);
    }
}
